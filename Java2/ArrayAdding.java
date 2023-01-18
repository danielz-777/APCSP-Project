package Java2;
import java.util.*;


public class ArrayAdding 
{
    //nums = [2, 7, 11, 15]
    //target = 9
    //2 + 7 = 9
    //use for loop and take the first number, then start adding the next number to that first number and continue until you find the answer
    //once the first number is finished being the starting point, go to the second index number and try the same and repeat
    public static void main(String[] args) 
    {
        /*
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i >= 0; i++)
        {
            System.out.println("Type in your number: ");
            System.out.println("If you want to stop inputting, type x");
            String input = scan.nextLine();
            if(input.equals("x"))
            {
                break;
            }
            list.add(input);
        }
        System.out.println("What is your target number: ");
        String target = scan.nextLine();

        System.out.print(list);
        /*for(int a = list.size(); a >= 0; a++)
        {
            
        }
        for(int i = list.size(); i >= 0; i++ )
        {
            int firstNumber = i;
            for(int j = list.size(); j >=0; j++)
            {
                int secondNumber = j;
                if (secondNumber + firstNumber == target)
                {

                }
            }
        }
        */
        int target2 = 32;
        int number1;
        int[] array = {2, 5, 9, 10, 20, 12};
        for (int a = 0; a < array.length; a++)
        {
            number1 = array[a];
            for (int b = 0; b < array.length; b++)
            {
                int number2 = array[b];
                System.out.println(number1 + number2);
                /*if(number1 + number2 == target2)
                {
                    System.out.println("That is the target number");
                    System.out.println(number1 + number2);
                }*/
            }
            
        }

        
        
        
    }
    
    

    
}
