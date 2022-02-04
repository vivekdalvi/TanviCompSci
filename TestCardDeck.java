/*
 * TestCardDeck.java
 * by Tanvi Dalvi
 * Period 2
 * 2/28/20
 * Worked Alone
 */

import Games.*;
import java.util.*;


public class TestCardDeck
{

    public static void main (String[] args)
    {
        CardDeck cd = new CardDeck();
        Card randomcard;
        Card[] cards;

        //prints 52 cards in random order
        System.out.println("//prints 52 cards in random order");
        for (int i = 0; i < 52; i++)
        {
            randomcard = cd.DrawRandomCard();
            System.out.println(randomcard.toString());
        }

        System.out.println("\n ***************************************************************** \n");

        //draws five more when nothing left
        System.out.println("//draws five more when nothing left");
        for (int i = 0; i < 5; i++)
        {
            randomcard = cd.DrawRandomCard();
            if( randomcard != null)
            {
                System.out.println(randomcard.toString());
            }
            else
            {
                System.out.println("NULL: No card left in the deck");
            }
            
        }
        System.out.println("\n ***************************************************************** \n");

        //resets the deck and draws 10 more
        System.out.println("//resets the deck and draws 10 more");
        cd.Reset();
        for (int i = 0; i < 10; i++)
        {
            randomcard = cd.DrawRandomCard();
            if( randomcard != null)
            {
                System.out.println(randomcard.toString());
            }
            else
            {
                System.out.println("NULL: No card left in the deck");
            }
        }
        System.out.println("\n ***************************************************************** \n");
        
        //resets the deck and draws five sets of 5 cards and prints it in sorted order
        System.out.println("//resets the deck and draws five sets of 5 cards and prints it in sorted ordercls");
        cd.Reset();
        for (int i = 1; i < 6; i++)
        {
            System.out.println("Set: " + i);
            cards = cd.Draw(5);
            Arrays.sort(cards);
            for(Card c: cards)
            {
                System.out.println(c.toString());
            }

            System.out.println("---------------------------------");
        }
    }
}

