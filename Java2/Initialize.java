package Java2;

public class Initialize 
{
    int year;

    public Initialize(){
        this.year = 20;
        System.out.println("Initialize");

    }

    public static void main(String args[]){
        Initialize init = new Initialize();
        System.out.println(init.year);
        init.year = 60;
    }




}
