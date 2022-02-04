
/*
 * CardDeck.java
 * by Tanvi Dalvi
 * Period 2
 * 2/28/20
 * Worked Alone
 */

import Games.*;
import java.util.*;

//Carddeck class uses Card class provided
public class CardDeck
{

    Card[] stack  = null;

    //constructors intializes 
    public CardDeck()
    {
        //resets the deck
        Reset();
    }


    //draws random card and sets to null so that it can't be drawn again
    public Card DrawRandomCard()
    {
        Card randomcard = null;
        Random gen = new Random();
        int index = -1;
        if (CheckCardsLeft() != 0)
        {
            while (randomcard == null)
            {
                index= gen.nextInt(52);
                randomcard = stack[index];
            }
            stack[index] = null;
        }
        return randomcard;
    } 

    //checks how many cards are left.
    public int CheckCardsLeft()
    {
        int count = 0;
        for (int i = 0; i < 52; i++)
        {
            if (stack[i] != null)
            {
                count ++;
            }
        }
        return count;
    }

    //resets the deck
    public void Reset()
    {
        stack = new Card[52];
        for (int i = 0; i < 52; i++)
        {
            stack[i] = new Card(i);
        }
    }

    //draws n random card
    public Card[] Draw(int n)
    {
        Card[] nrandom = null;
        if( CheckCardsLeft() >= n )
        {
            nrandom = new Card[n];
            for (int i = 0; i < n; i++)
            {
                nrandom[i] = DrawRandomCard();
            }
            
        }
        return nrandom;
    }
}