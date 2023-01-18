package Java2;

public class OverloadedMethods 
{
    //Normally you can't have two different functions with the same
    //class name, but if you have differnet parameters, it can still go
    String color;
    String size;
    String name;
    public static void main(String[] args) 
    {
        OverloadedMethods thing = new OverloadedMethods();
        thing.color = "blue ";
        thing.size = " big";
        thing.name = " Bob";

        System.out.println(thing.color + thing.size + thing.name);
    }
}
public class OverloadedMethods 
{
    String color;
    String size;
    String name;

    public static void main(String[] args) 
    {
        Method thing = new Method();
        thing.color = "red ";
        thing.size = " small";
        thing.name = " Joe";

        System.out.println(thing.color + thing.size + thing.name);
    }
}
