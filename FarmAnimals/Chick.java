/*
 * Chick.java
 * by Tanvi Dalvi
 * 3/5/2020
 * Period 2
 */
package FarmAnimals;


public class Chick implements Animal
{
    private String myType;
    private String mySound;
    private String mySound2;
    private boolean twoSounds;
    private boolean pickSound2;

    public Chick()
    {
        myType = "chick";
        mySound = "cheep";
    }

    public Chick (boolean twosounds)
    {
        twoSounds = twosounds;
        myType = "chick";
        mySound = "cheep";
        mySound2 = "cluck";
        pickSound2 = true;
    }

    public String getSound()
    {
        if(twoSounds == true)
        {
            
            if (pickSound2 == true)
            {
                pickSound2 = false;
                return mySound2;
            }
            pickSound2 = true;
        } 
        return mySound;
    }
    public String getType()
    {
        return myType;
    }
}