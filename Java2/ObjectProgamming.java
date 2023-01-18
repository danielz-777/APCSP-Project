package Java2;
import java.util.*;
import java.util.Scanner;


public class ObjectProgamming 
{
    String color;
    String make;
    String model;
    int year;


    public static void main(String[] args) 
    {
        //Analogy: cars have certain wheels, doors, and windows:
        //you find this under the object called car

        //To start making an object, you first make a class
        

        //To access those variables, you make an object that is the name of the class
        ObjectProgamming myCar = new ObjectProgamming();
        myCar.color = "blue";
        myCar.make = "Toyota";
        myCar.model = "Civic";
        myCar.year = 2003;

        // System.out.println(myCar.color);
        // System.out.println(myCar.make);
        // System.out.println(myCar.model);
        // System.out.println(myCar.year);

        ObjectProgamming car1 = new ObjectProgamming();
        car1.color = "Red";
        car1.make = "Honda";
        car1.model = "Civic";
        car1.year = 2008;

        // System.out.println(car1.color);
        // System.out.println(car1.make);
        // System.out.println(car1.model);
        // System.out.println(car1.year);

        ObjectProgamming car2 = new ObjectProgamming();
        car2.color = "Yellow";
        car2.make = "Dodge";
        car2.model = "Challenger";
        car2.year = 2018;

        // System.out.println(car2.color);
        // System.out.println(car2.make);
        // System.out.println(car2.model);
        // System.out.println(car2.year);

        //You can use foor loop to print them out using lists

        List<ObjectProgamming> list1 = new ArrayList<ObjectProgamming>();
        list1.add(myCar);
        list1.add(car1);
        list1.add(car2);
        //list1.get(0).color === myCar.color
        // have to do this to get the objects to print out
        for(int i = 0; i < list1.size(); i++)
        {
            System.out.println(list1.get(i).color + " " + list1.get(i).make + " " + list1.get(i).model + " " + list1.get(i).year);
        }

        //SHORTHAND METHOD
        for (ObjectProgamming x:list1)
        {
            System.out.println(x.color + x.make + x.model + x.year);
        }



        //MAKE A CAR DEALERSHIP: user enter as many cars as they want
        //as user for make, model, year, and color
        //add that to a list and print out the list
        Scanner scan = new Scanner(System.in);

        //Object; element of a class
        // Class: where objects/variables are put inside
      
        
        List<ObjectProgamming> dealership = new ArrayList<ObjectProgamming>();
        //dealership.add();
        
        public static ObjectProgamming AddCar()
        {
            
            //copy paste for loop stuff
            System.out.println("enter car ");
            String car = scan.nextLine();
            System.out.println("enter model ");
            String models = scan.nextLine();
            System.out.println("enter year ");
            int years = Integer.parseInt(scan.nextLine());
            System.out.println("enter color ");
            String colors = scan.nextLine();

            ObjectProgamming carcar = new ObjectProgamming();
            carcar.make = car;
            carcar.model = models;
            carcar.year = years;
            carcar.color = colors;
            if(car.equals("stop"))
            {
                return carcar;
            }
            return carcar;
        }

        dealership.add(AddCar());
        for (ObjectProgamming x:dealership)
            System.out.print(x.make + x.model + x.year + x.color);
        //dealership.add(AddCar(carcar.make));




    }
}
