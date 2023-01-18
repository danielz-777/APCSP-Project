package Java2;
import java.util.*;

public class Transaction 
{
    private double subtotal;
    private double total;
    private double taxes = .08;
    private List<Item> list = new ArrayList<Item>();
    
    





    public void addItem(String item, double price)
    {
        //this = the object that calls adds to the function
        Item newItem = new Item(); //call the Item class  in a differnet file
        newItem.name = item; //takes the variables int, the Item class and sets them equal to the parameters above
        newItem.price = price;
        this.list.add(newItem);
    }

    //Setters for subtotal, total, and taxs, sets a varialbe to something 
    public void setSubtotal()
    {

    }
    public void setTotal()
    {

    }
    public void setTaxes()
    {

    }

    //Getters for subtotal, total, taxes, and items

    public double getSubtotal() //gets the varaible from somewhere
    {
        //get access to the prices of each item in our list
        //and add them together
        double sum = 0.0;
        for(int i = 0; i < this.list.size(); i++)
        {
            sum += this.list.get(i).price;
        }
        this.subtotal = sum;
        return this.subtotal;
    }
    
    public double getTotal()
    {
        double sum = this.subtotal + this.taxes * this.subtotal;
        return sum;
    }

    public double getTaxes()
    {
        double sum = this.taxes * this.subtotal;
        return sum;
        //return this.taxes;
    }

    public List<String> getItems() //returns the list of items
    {
        List<String> newlist = new ArrayList<String>();
        for(int i = 0; i < this.list.size(); i++)
        {
            newlist.add(this.list.get(i).name);
        }
        return newlist;
    }








    public static void main(String[] args) 
    {
        
    }
}
