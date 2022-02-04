
/*
 * TestCard.java
 * by Tanvi Dalvi
 * Period 2
 * 2/10/20
 * Worked Alone
 */

import Games.*;

import java.util.*;


public class TestCard
{
    public static void main (String[] args)
    {
        Card[] stack = new Card[20];
        Random gen = new Random();
        for (int i = 0; i < 20; i++)
        {
            stack[i] = new Card(gen.nextInt(52));
        }
        System.out.println("*********Random Stack*************");
        for (int i = 0; i < 20; i++)
        {
            System.out.println(stack[i].toString());
        }

        Arrays.sort(stack);
        System.out.println("*********Sorted Stack*************");
        for (int i = 0; i < 20; i++)
        {
            System.out.println(stack[i].toString());
        }

    }
}