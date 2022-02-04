
package Vehicles;


public class Testcar
{
    public static void main (String [] args)
    {

        Vehicle myvehicle = new Car();

        myvehicle.setActualpassengers(3);
        myvehicle.setMaxpassengers(6);
        System.out.println(myvehicle.toString());

        


        myvehicle = new Bike();
        myvehicle.setActualpassengers(1);
        myvehicle.setMaxpassengers(20);
        System.out.print(myvehicle.toString());


        myvehicle = new Porsche();
        myvehicle.setActualpassengers(1);
        myvehicle.setMaxpassengers(20);
        System.out.print(myvehicle.toString());
        
         // p = myvehicle;
        
    }
}