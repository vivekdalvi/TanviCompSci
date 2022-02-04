/*
 * Card.java
 * by W P Osborne
 * 2/10/2020
 * Period 2
 */
package Games;

public class Card implements Comparable<Card>{
    // instance variable
    private int index;
    // Class Constant
    private static final String[] suits = {
        "Clubs", "Diamonds", "Hearts", "Spades"};
    
    // constructor
    public Card(int index){
        this.index = index;
    }
    
    // accessors
    public int getIndex(){
        return index;
    }
    public int getFaceValueAsInt(){
        return index % 13 + 1;
    }
    public String getFaceValueAsString(){
        int n = index % 13;
        if(n == 0){
            return "Ace";
        }
        if(n == 10){
            return "Jack";
        }
        if(n == 11){
            return "Queen";
        }
        if(n == 12){
            return "King";
        }
        return Integer.toString(n + 1);
    }
    
    public String getSuit(){
        return suits[index / 13];
    }
    
    public int compareTo(Card other){
        return this.index - other.getIndex();
    }
    
    public String toString(){
        String str = "The " + getFaceValueAsInt();
        str += " of " + getSuit();
        return str;
    }
}
