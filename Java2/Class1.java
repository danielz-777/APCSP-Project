package Java2;


public class Class1 
{
    public static void main(String[] args) 
    {
        int a = 0;
        int sum = 0;
        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 7;
        numbers[2] = 4;
        numbers[3] = 8;
        numbers[4] = 2;
        numbers[5] = 3;
        for (int i = 0; i < numbers.length; i++ )
        {
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
            a++;
        }
        System.out.println(sum/a);
        

    }
    




}
