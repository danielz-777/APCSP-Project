package Java2;
import java.util.Scanner;

public class Bank2
{
    public static void main(String[] args)
    {
        Bank account1 = new Bank();
        Bank account2 = new Bank(true, "John", 567, 4532);

        System.out.println("Account1 is : ");
        System.out.println(account1.toString());
        System.out.println("Account1's Balance is : ");
        System.out.println(account1.getAccountBalance());


        System.out.println("Account2 is : ");
        System.out.println(account2.toString());
        System.out.println("Account2's balance is : ");
        System.out.println(account2.getAccountBalance());


    }
}
