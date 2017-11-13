import java.util.Scanner;
import java.util.ArrayList;


public class Vehicle {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<Vehicle> carList = new ArrayList<Vehicle>();
        int num = 0;
        boolean done = false;
        while (!done)
        {

            num++;
            System.out.println("enter the make");
            String make = in.nextLine();
            System.out.println("enter the model");
            String model = in.nextLine();
            System.out.println("enter the city mpg");
            int cityMPG = in.nextInt();
            System.out.println("enter the highway mpg");
            int hwyMPG = in.nextInt();
            System.out.println("enter the list price");
            int listPrice = in.nextInt();
            String dummy = in.nextLine();
            VehicleCon test = new VehicleCon(make, model, cityMPG, hwyMPG, listPrice);
            carList.add(test);
            if (num < 5)
            {
                System.out.println("do you wish to add another car? yes or no");
                String another = in.nextLine();

                if (another.equalsIgnoreCase("no"))
                {
                    done = true;
                }
            }
            else
                done = true;
        }
        int carNumber = 1;
        System.out.print('\f');
        for (Vehicle a : carList)
        {

            System.out.println();
            System.out.println("car Number " + carNumber);
            System.out.println("make: " + a.getMake());
            System.out.println("model: " + a.getModel());
            System.out.println("cityMPG: " + a.getCityMPG());
            System.out.println("hwyMPG: " + a.getHwyMPG());
            System.out.println("list price: " + a.getListPrice());
            carNumber++;
        }
    }
}


