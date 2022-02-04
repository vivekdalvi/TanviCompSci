/*
 * NamedCow.java
 * by Tanvi Dalvi
 * 3/5/2020
 * Period 2
 */
package FarmAnimals;

public class NamedCow extends Cow
{

    private String Name;

    public NamedCow(String name)
    {
        Name = name;
    }

    public String GetName()
    {
        return Name;
    }

}