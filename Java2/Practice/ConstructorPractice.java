package Java2.Practice;

public class ConstructorPractice 
{
    int year;

    public ConstructorPractice()
    {
        this.year = 2020;
        
    }

    public ConstructorPractice(int Year)
    {
        this.year = Year;
    }
    public static void main(String args[])
    {
        ConstructorPractice con = new ConstructorPractice();
        ConstructorPractice con2 = new ConstructorPractice(2020);
        System.out.println(con);
        System.out.println(con2);
    }
    
}
