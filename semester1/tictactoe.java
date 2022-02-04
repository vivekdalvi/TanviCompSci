/*
 * tictactoe.java
 * by Tanvi Dalvi
 * Period 2
 * 2/3/20
 * Worked Alone
 */


package semester1;

import java.util.Scanner;
import java.util.Random;

public class tictactoe
{
    public static final String ANSI_GREEN  = "\u001B[32m";
    public static final String ANSI_RESET  = "\u001B[0m";
    public static final String ANSI_BLUE   = "\u001B[34m";
    public static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
    public static final String ANSI_RED    = "\u001B[31m";

    static boolean winpossibility = true;

    public static void main (String[] args)
    {
        int player1win = 0;
        int player2win = 0;
        int nowin = 0;
        String player1 = "";
        String player2 = "";

        //print the welcome message
        System.out.println("-------------------------------------");
        System.out.println("Welcome to Tic-Tac-Toe by Tanvi Dalvi");
        System.out.println("-------------------------------------\n");
        System.out.print("Do you want to play a game [yes/no]?  ");

        Scanner console = new Scanner(System.in);
        String s = console.next();

        while (s.toLowerCase().compareTo("yes") == 0)
        {
            //generates two dimensional array to represent the board
            String[][] gameboard = InitializeBoard();
            //randomly selects X or O for player1 
            Random gen = new Random();
            if (gen.nextInt(2) == 0)
            {
                player1 = ANSI_BLUE + "X" + ANSI_RESET;
                player2 =  ANSI_BRIGHT_YELLOW + "O" + ANSI_RESET;
                
            }
            else
            {
                player1 = ANSI_BRIGHT_YELLOW + "O" + ANSI_RESET;
                player2 = ANSI_BLUE +"X" + ANSI_RESET;
            }
            //game loop
            boolean gamewon = false;
            boolean winpossible = true;
            while (gamewon == false && winpossible == true)
            {
                PlayerMove(console, player1, gameboard);
                winpossible = IsWinPossible(gameboard, player1);
                if(CheckWin(gameboard, player1) == false && winpossible == true)
                {
                    PlayerMove(console, player2, gameboard);
                    winpossible = IsWinPossible(gameboard, player2);
                    if(CheckWin(gameboard, player2) == true)
                    {
                        gamewon = true;
                        player2win ++;
                        PrintWinMessage("Player2", gameboard);
                    }
                }
                else
                {
                    gamewon = true;
                    player1win ++;
                    PrintWinMessage("Player1", gameboard);
                }
            }
            if (gamewon == false && winpossible == false)
            {
                System.out.println("*************************************");
                PrintBoard(gameboard);
                System.out.println(ANSI_RED + "Game has no winner!  " + ANSI_RESET);
                System.out.println("*************************************");
                nowin ++;
            }
            System.out.print("Do you want to continue playing this game [yes/no]? ");
            s = console.next();
        }

        System.out.println("\n\nThanks for playing");
        int total = player1win + player2win + nowin;
        System.out.println("Total number of games: " + total);
        System.out.println("Number of games won by " + player1 + " :" + player1win);
        System.out.println("Number of games won by " + player2 + " :" + player2win);
        System.out.println("Total number of games with no winner: " + nowin);
        console.close();
    }

    public static void PlayerMove(Scanner console, String player, String[][] board)
    {
         PrintBoard(board);
         boolean correctinput = false;
         while (correctinput == false)
         {
            System.out.print("Where do you want to put " + player + " [x,y] ? ");
            String input = console.next();
            String[] coordinates = input.split(",");
            if(coordinates.length == 2)
            {
                if(Integer.parseInt(coordinates[0]) < 3 && Integer.parseInt(coordinates[0]) >= 0 && Integer.parseInt(coordinates[1]) < 3 && Integer.parseInt(coordinates[1]) >= 0)
                {
                    int x = Integer.parseInt(coordinates[0]);
                    int y = Integer.parseInt(coordinates[1]);
                    if(board[x][y] == " ")
                    {
                       board[x][y] = player;  
                       correctinput = true;                   
                    }
                } 
            }
            if(correctinput == false)
            {
                System.out.print( ANSI_RED + "Wrong Input, Please Enter Again..." + ANSI_RESET + "\n");
            }
         }
    }

    public static void PrintBoard(String[][] board)
    {
        for(int i =0; i < 3; i++)
        {
            System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2] );
            if(i < 2)
            {
                System.out.println("----------");
            }
        }
    }

    //checks if winning is possible
    public static boolean IsWinPossible(String[][] board, String player)
    {
        boolean [] winpossiblities = new boolean[] {true, true, true, true, true, true, true, true};
        for (int i =0; i < 3; i++)
        {
            if(board[i][0] == player || board[i][1] == player || board[i][2] == player)
            {
                winpossiblities[i] = false;
            }   
        } 

        for (int i =0; i < 3; i++)
        {
            if(board[0][i] == player || board[1][i] == player || board[2][i] == player)
            {
                winpossiblities[i+3] = false;
            }            
        } 

        if(board[0][0] == player || board[1][1] == player || board[2][2] == player)
        {
            winpossiblities[6] = false;
        }
    
        if(board[0][2] == player || board[1][1] == player || board[2][0] == player)
        {
            winpossiblities[7] = false;
        }

        for(int i =0; i< 8; i++)
        {
            if(winpossiblities[i] == true)
            {
                return true;
            }
        }
        return false;
    }

    //checks if player has won
    public static boolean CheckWin(String[][] board, String player)
    {
        for (int i =0; i < 3; i ++)
        {
            if(board[0][i].compareTo(player) == 0 &&
            board[1][i].compareTo(player) == 0 &&
            board[2][i].compareTo(player) == 0)
            {
                return true;
            }
        }

        for (int i =0; i < 3; i ++)
        {
            if(board[i][0].compareTo(player) == 0 &&
            board[i][1].compareTo(player) == 0 &&
            board[i][2].compareTo(player) == 0)
            {
                return true;
            }
        }
        
        if(board[2][0].compareTo(player) == 0 &&
        board[1][1].compareTo(player) == 0 &&
        board[0][2].compareTo(player) == 0)
        {
            return true;
        }

        if(board[0][0].compareTo(player) == 0 &&
        board[1][1].compareTo(player) == 0 &&
        board[2][2].compareTo(player) == 0)
        {
            return true;
        }
        return false;
    }

    public static void PrintWinMessage(String player, String[][] board)
    {
        System.out.println("\n\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        PrintBoard(board);
        System.out.println(ANSI_GREEN + player + " has won!!" + ANSI_RESET);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n\n" );  
    }

    public static String[][] InitializeBoard()
    {
        String[][] board = new String [3][3]; 
        for(int i = 0; i< 3; i++)
        {
            for (int j =0; j<3; j++)
            {
                board[i][j] = " ";
            }
        }
        return board;
    }
}