/*
 * Pig.java
 * by Tanvi Dalvi
 * 3/5/2020
 * Period 2
 */
package FarmAnimals;

public class Pig implements Animal
{
    private String myType;
    private String mySound;

    public Pig()
    {
        myType = "pig";
        mySound = "oink";
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