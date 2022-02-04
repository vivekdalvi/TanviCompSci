/*
 * PhoneticNames.java
 * by W. P. Osborne
 * 1/7/19
 */
//package FirstArrays;
package semester1;

import java.util.Scanner;
public class PhoneticNames {
    // class constants
    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String[] NAMES = {
        "Alpha",
        "Bravo",
        "Charlie",
        "Delta",
        "Echo",
        "Foxtrot",
        "Golf",
        "Hotel",
        "India",
        "Julliet",
        "Kilo",
        "Lima",
        "Mike",
        "November",
        "Oscar",
        "Papa",
        "Quebec",
        "Romeo",
        "Sierra",
        "Tango",
        "Uniform",
        "Victor",
        "Whiskey",
        "X-ray",
        "Yankee",
        "Zulu"
    };
    
    public static void main(String[] args){
        Scanner kbReader = new Scanner(System.in);
        System.out.print("What word do you want spelled phonetically? ");
        String word = kbReader.next();
        
        word = word.toUpperCase();
        
        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            int charIndex = findIndex(c);
            if(charIndex >= 0){
                System.out.println(NAMES[charIndex]);
            }
        }
        kbReader.close();
    }
    
    // return index or -1 if character not found
    public static int findIndex(char c){
        for(int i = 0; i < LETTERS.length(); i++){
            if(c == LETTERS.charAt(i)){
                return i;
            }
        }
        return -1; // not found
    }
}