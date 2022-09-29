import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of gallons of gas in the tank: ");
        System.out.println("Enter the fuel efficiency in miles per gallon: ");
        System.out.println("Enter the price of gas per gallon: ");

        float gallons=sc.nextFloat();
        float fuelEff=sc.nextFloat();
        float gasPerGal=sc.nextFloat();
        double costPer100=(gallons)*100;
        double carCanGo=(gasPerGal/gallons);
        System.out.println("The cost per 100 miles is: $"+costPer100);
        System.out.println("Your car can go about "+carCanGo + " miles with gas in the tank");
    }
}