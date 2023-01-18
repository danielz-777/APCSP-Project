package Java2;
import java.util.*;
import java.util.Scanner;

public class Review 
{
    public static boolean comparision(String word, String word2) //sets it up for the print statement later on to compare
    // you can use word and word2 to make sure that when you do comparision(name, name2), the method can actually run
    //this is setting parameters so you can call upon it later on
    {
        
        if(word == word2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }   
    public static void main(String[] args) 
    {
        String name = "wd";
        String name2 = "";
        comparision(name,name2); //create the variables name and name 2 and name it
        //the comparision(name, name2) calls the function to compare both the variables 

        
    }

    
        
        
    
    
}
