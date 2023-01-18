package Java2;
import java.util.*;

public class Palindrome 
{
    public static void main(String args[])
    {
        /* take user input and check if its a palindrome
        CheckPalindrome(String) return True/False

        */
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your word: ");
        String word = scan.nextLine();
        word = word.toLowerCase(); //makes sure the word is lower case, so there are no errors if there is a Racecar into a racecar
        String output = "";

        for (int i = word.length() - 1; i >= 0; i--)//starts from the end of the word and goes down
        {
            output = output + word.charAt(i);//takes the character at index i 
            //new string that is the reverse of the input
        }
        System.out.println(output);
        if (word.equals(output))
        {
            System.out.println("this word is a palindrome");
        }
        else
        {
            System.out.println("this word is not a palindrome");
        }


    }
}
