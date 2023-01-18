package Java2.EMedical;

public class recursion 
{
    public int recursions(int n)
    {
        if (n ==1)
        {
            System.out.println(n);
            return 1;

        }
        else
        {
            System.out.println(n);
            recursions(n - 1);
            System.out.println(n);
            return 1;
            
        }

    }

    public static void main(String[] args)
    {
        recursion test = new recursion();

        test.recursions(4);
    }
}
