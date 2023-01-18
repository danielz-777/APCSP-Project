package Java2;

public class Constructor 
{
    //Constructor initializes a function and you can call it
    int year;

    public Constructor(){
        this.year = 2020;
    }
    public Constructor(int yearInput){ //has a parameter as opposed to the other one
        this.year = yearInput;
    }

    public static void main(String args[]){
        Constructor con = new Constructor(); //Both use the same Constructor 
        Constructor con2 = new Constructor(2021);  //calls the method with the parameter
        System.out.println(con.year);
        System.out.println(con2.year);
    }
}
