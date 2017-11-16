import java.util.Scanner;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;


public class Vehicle extends Application{

    Stage window1;
    Button button1;

    public static void main(String[] args)
    {
        launch(args);
        Scanner in = new Scanner(System.in);
        ArrayList<VehicleCon> carList = new ArrayList<VehicleCon>();
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
            int ListPrice = in.nextInt();
            String dummy = in.nextLine();
            VehicleCon car = new VehicleCon(make, model, cityMPG, hwyMPG, ListPrice);
            carList.add(car);
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
        for (VehicleCon a : carList)
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

    @Override
    public void start(Stage primaryStage) throws Exception {
        window1 = primaryStage;
        window1.setTitle("Car Tracker");





        StackPane layout1 = new StackPane();
        layout1.getChildren().addAll(button1);
        Scene scene1 = new Scene(layout1, 300,300);
        window1.setScene(scene1);
        window1.show();

    }
}


