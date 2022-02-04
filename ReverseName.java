
public class ReverseName {

    public static void main (String[] args)
    {
        String Name = "Marla Singer";
        System.out.println(Reverse(Name));
    }

    public static String Reverse(String Name)
    {
        String[] names = Name.split(" ");
        return names[1] +" " + names[0].charAt(0) + ".";
    }
}