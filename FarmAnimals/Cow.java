/*
 * Cow.java
 * by Tanvi Dalvi
 * 3/5/2020
 * Period 2
 */
package FarmAnimals;

public class Cow implements Animal
{
    private String myType;
    private String mySound;

    public Cow()
    {
        myType = "cow";
        mySound = "moo";
    }
    public String getSound()
    {
        return mySound;
    }
    public String getType()
    {
        return myType;
    }
}