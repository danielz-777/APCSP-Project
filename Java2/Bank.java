package Java2;
import java.io.File;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

//Encapsulation = OOP concept that binds togetehr the data and functions that manipulate data in such a way that keeps both safe from outside 
//miuse or interferance
public class Bank  
{




    private boolean accountActive;//you can't change this outside of this file
    private String name;
    private String ID; //set these to private, so nothing can mess it up
    private int accountBalance;

    
    
    Scanner scan = new Scanner(System.in); //for the login

    
    

    public boolean getAccountStatus() //all it returns is if the account is active or not
    {//a getter method only gets something and returns it
        //returns a varialbe
        return this.accountActive;
    }
    public int getAccountBalance()
    {
        return this.accountBalance;
    }

    public void setAccountStatus(boolean status) //just sets a variable 
    {
        this.accountActive = status;
    }
    

    public String toString()
    {
        return this.name + "_" + this.ID + "@gmail.com";
    }


    public Bank() //this also a constructor
    {
        this.accountActive = false;
        this.name = "default";
        this.ID = "";
        this.accountBalance = 0;
    }

//construcotr with parameters
    public Bank(boolean status, String username, String id, int balance) //only construcotrs and setter methods can change these variables
    {
        this.accountActive = status;
        this.name = username;
        this.ID = id;
        this.accountBalance = balance;
    }


    public static String login(Hashtable<String, String> logins, Scanner input) 
    {
        
        String user = "";
        String pass;
        boolean failLogin = true;


        

        while(failLogin)
        {
            System.out.println("Enter your username: "); //login method for loggin in to bank, requires username and password
            user = input.nextLine();
            System.out.println("Enter your password: ");
            pass = input.nextLine();
            if (logins.containsKey(user))
            {
                if (logins.get(user).equals(pass))
                {
                    System.out.println("login successful");
                    failLogin = false;
                }
                else
                {
                    System.out.println("Incorrect Username or Password");
                }
            }
            else
            {
                System.out.println("Incorrect Username or Password");
            }
        }
        
       return user;
    }

    public static void loginSuccess(Scanner input, String username) //after login, check if account is active and if it is, return balance and name
    {
        Boolean accountStatus = false;
        String accountName = "";
        int accountBalance = 0;
        
        
        try{

            File accountFile = new File("C:\\Users\\16262\\Desktop\\CSProject\\" + username + ".txt");
            Scanner scAccount = new Scanner(accountFile);
            if(scAccount.hasNextLine())
            {
            
                if(scAccount.nextLine().equals("true"))
                {
                    accountStatus = true;
                }
                if(scAccount.hasNextLine())
                {
                    accountName = scAccount.nextLine();
                }
                if(scAccount.hasNextLine())
                {
                    accountBalance = Integer.parseInt(scAccount.nextLine());
                }
            }
            scAccount.close();
            
        }
        catch(IOException e)
            {
                System.out.println("An error has occured.");
                e.printStackTrace();
            }
            
            Bank user1 = new Bank(accountStatus, accountName, username, accountBalance);
           
            

            //check if account is active or not and if not, do something
            if(accountStatus = true)
            {
                System.out.println("Hello " + user1.name + ": press 1. to check balance, 2. deposit, 3. withdrawal, 4. Logout");
                String loginChoice = "1";
                boolean LoggedIn = true;

                while(LoggedIn)
                {
                    loginChoice = input.nextLine();
                    if(loginChoice.equals("1"))
                    {
                        System.out.println("Your account balance is " + user1.getBalance() + "\n" );
                    }
                    else if(loginChoice.equals("2"))
                    {
                        System.out.println("How much would you like to deposit");
                        int depositAmount = Integer.parseInt(input.nextLine());
                        user1.deposit(depositAmount);
                        System.out.println("Your account balance is " + user1.getBalance() + "\n" );

                    }
                    else if(loginChoice.equals("3"))
                    {
                        System.out.println("How much would you like to withdrawal?");
                        int withDrawalAmount = Integer.parseInt(input.nextLine());
                        user1.withdrawal(withDrawalAmount);
                    }
                    else if(loginChoice.equals("4"))
                    {
                        System.out.println("Logging out... ");
                        LoggedIn = false; //doesn't actually break out of loop
                        break;
                    }
                    else{
                        System.out.println("Invalid Choice:");
                    }
                    System.out.println("press 1. to check balance, 2. deposit, 3. withdrawal, 4. Logout");
                }
                
            }

            else{
                System.out.println("This account is not active. Try again and create a new account. ");
                
            }

           
    }

    public static String createAccount(Scanner input, Hashtable<String, String> logins)
    {
        ArrayList<String> captcha = new ArrayList<String>();
        Random random = new Random();
        String inputCaptcha = "";
        String correctCaptcha = "";
        boolean notCorrect = true;

        while(notCorrect)
        {
            for (int i = 0; i < 5; i++)
            {
                captcha.add(random.nextInt(26) + "a");
                
            }
    
            System.out.println("Prove you are not a bot by correctly typing the characters shown \n");
            for (int i = 0; i < 5; i++)
            {
                System.out.println(captcha.get(i));
                correctCaptcha += captcha.get(i);
            }
    
            inputCaptcha = input.nextLine();
            if(inputCaptcha.equals(correctCaptcha))
            {
                System.out.println("Correct! You are a human! \n");
                notCorrect = false;
            }
            else{
                System.out.println("Wrong! Try again... ");
            }
        }
        






        System.out.println("Welcome. Please put your username that you want: \n");
       
        boolean inputName = true;
        String user = "";

        while(inputName)
        {
            inputName = false;
            user = input.nextLine();
            if(logins.containsKey(user))
            {
                inputName = true;
                
                System.out.println("Username is already taken, please make another: ");
            }    
            
            
        }

        String password  = "";
        String password2 = "";
        boolean passwordMatch = true;
        while(passwordMatch)
        {
            System.out.println("Please enter your password \n");
            password = input.nextLine();
            System.out.println("Please re-enter your password \n");
            password2 = input.nextLine();
            if(password.equals(password2))
            {
                System.out.println("These passwords match! ");
                passwordMatch = false;
            }
            else
            {
                System.out.println("The passwords do not match!");
            }

            
            try{
                FileWriter myWriter = new FileWriter("C:\\Users\\16262\\Desktop\\Java Code\\login.txt", true);
                myWriter.write ("\n" + user + "\n" + password) ;
                myWriter.close();
                
                FileWriter myWriter2 = new FileWriter("C:\\Users\\16262\\Desktop\\CSProject\\" + user + ".txt");
                myWriter2.write ("true\n" + user + "\n0") ;
                myWriter2.close();
            }
            catch(IOException e){
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
        return user;
    }

    public void Quit()
    {

    }

    public static int start(Scanner input)
    {
        
        boolean validChoice = true;
        int choiceInt = -1;
        System.out.println("Welcome to the bank. Press 1. for login and 2. for New Account and 3. for Quit");
        String choice = "";
        
        while(validChoice)
        {
            choice = input.nextLine();
            if(choice.equals("1"))
            {
                choiceInt = 1;
                validChoice = false;
            }
            else if (choice.equals("2"))
            {
                choiceInt = 2;
                validChoice = false;
            }
            else if (choice.equals("3"))
            {
                choiceInt = 3;
                validChoice = false;
            }
            else{
                System.out.println("Choice does not exist");
                validChoice = true;
            }
        }
        
        return choiceInt;

    }


    public int getBalance()
    {
        return this.accountBalance;
    }

    public void deposit(int depositAmount)
    {
        int Total = this.accountBalance + depositAmount;
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\16262\\Desktop\\CSProject\\" + this.ID + ".txt");
            myWriter.write("true" + "\n" + this.name + "\n" + Total);
            this.accountBalance = Total;
            myWriter.close();
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void withdrawal(int withDrawalAmount)
    {
        int Total = this.accountBalance - withDrawalAmount;
        if(Total < 0)
        {
            System.out.println("You cannot withdraw this amount of money.  You do not have enough money in your account to do this.");
            return;
        }
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\16262\\Desktop\\CSProject\\" + this.ID + ".txt");
            myWriter.write("true" + "\n" + this.name + "\n" + Total);
            this.accountBalance = Total;
            myWriter.close();
        }
        catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }    }
        





    public static void main(String[] args) throws Exception
    {
       



        File file = new File("C:\\Users\\16262\\Desktop\\Java Code\\login.txt");
        Scanner input = new Scanner(System.in);
        Scanner scn = new Scanner(file);
        String usernames = "";
        

        Hashtable<String, String> logins = new Hashtable<String, String>();

        while(scn.hasNextLine())
        {
            logins.put(scn.nextLine(), scn.nextLine());     // dictionary [key, value] = [username, password]
        }
        scn.close();

        int choice = start(input);
        
       

        if(choice == 1)
        {
            //only returns on successful login
            // need login to return the username, then use username to get more information like name, ID, account balance
            usernames = login(logins, input);
            loginSuccess(input, usernames);
            


        }
        else if(choice == 2)
        {
           // createAccount( input, logins);
            usernames = createAccount(input, logins);
            System.out.println("Logging you into your account...\n");
            loginSuccess(input, usernames);
        }
        else if(choice == 3)
        {
            return;
        }
        else
        {
            System.out.println("Should not reach here, something is wrong");
            return;
        }


        

        
        
        

       





        
    }

}
