package Java2.EMedical;
import java.util.*;



public class Application 
{
    String patientName;
    int age;
    String sympton;
    int howYouFeeling;
    Scanner scan = new Scanner(System.in);
    
    
    public Application(String PatientName, int Age, String Sympton, int HowYouFeeling, List<Application> newList)
    {
        patientName = PatientName;
        age = Age;
        sympton = Sympton;
        howYouFeeling = HowYouFeeling;
        newList.add(this);


    }

    public Application(List<Application> LIST)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        patientName = scan.nextLine();
        System.out.println("What is your age?");
        age = scan.nextInt();
        scan.nextLine();
        System.out.println("What is your sympton?");
        sympton = scan.nextLine();
        System.out.println("How are you feeling?");
        howYouFeeling = scan.nextInt();
        scan.nextLine();

        LIST.add(this);
        
        
        scan.close();
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        //String symptonString = scan.next();

        List<Application> list = new ArrayList<Application>();


        Aspirin medicine1 = new Aspirin();
        medicine1.setNumTimes(10);
        medicine1.setName("Aspirin");
        medicine1.setDate("1/2/2023");
        medicine1.setEffects("nausea, vomiting, heartburn, and stomach cramps");
        medicine1.setCost(20);

        Fentanyl medicine2 = new Fentanyl();
        medicine2.setNumTimes(5);
        medicine2.setName("Fentanyl");
        medicine2.setDate("5/20/2025");
        medicine2.setEffects("dizziness, nausea, vomiting, pupillary constriction, and respiratory depression. ");
        medicine2.setCost(30);

        //Application patient = new Application("Bob", 90, symptonString, 3, list);
        //Application patient2 = new Application("John", 25, symptonString, 1, list);
        //Application patient3 = new Application("LIKFSAKNBKNAKS", 57, symptonString, 6, list);
        // patient4 = new Application("Rock", 71, symptonString, 5, list);
        Application patient5 = new Application (list);
       // List[] list = new List[];
        
        // list.add(patient);
        // list.add(patient2);
        // list.add(patient3);
        // list.add(patient4);


        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i).sympton.equalsIgnoreCase("headache"))
            {
            System.out.println("You need " + medicine1.getName() + ". You should use it " + medicine1.getNumTimes() + " a day." + 
            " It expires on " + medicine1.getExpirationDate() + ". Possible side effects include " + medicine1.getSideEffects() +
            " The cost of this item is " + medicine1.getPrice() + " dollars." );
            
            }
            else if(list.get(i).sympton.equalsIgnoreCase("fever"))
            {
            System.out.println("You need " + medicine1.getName() + ". You should use it " + medicine1.getNumTimes() + " a day." + 
            " It expires on " + medicine1.getExpirationDate() + ". Possible side effects include " + medicine1.getSideEffects() +
            " The cost of this item is " + medicine1.getPrice() + " dollars." );
            }
            else if(list.get(i).sympton.equalsIgnoreCase("Common Cold"))
            {
            System.out.println("You need " + medicine1.getName() + ". You should use it " + medicine1.getNumTimes() + " a day." + 
            " It expires on " + medicine1.getExpirationDate() + ". Possible side effects include " + medicine1.getSideEffects() +
            " The cost of this item is " + medicine1.getPrice() + " dollars." );
            }
            else{
            System.out.println("You need " + medicine2.getName() + ". You should use it " + medicine2.getNumTimes() + " a day." + 
            " It expires on " + medicine2.getExpirationDate() + ". Possible side effects include " + medicine2.getSideEffects() +
            " The cost of this item is " + medicine2.getPrice() + " dollars." );
            }
        }
        

    }




}
