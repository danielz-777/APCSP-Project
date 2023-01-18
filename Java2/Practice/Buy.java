package Java2.Practice;

public class Buy 
{
    




    public static void main(String args[])
    {
        PracticeClass newclass = new PracticeClass();
        newclass.setItem(" Banana ");
        newclass.setCost(20);
        newclass.setNumberOfItems(10);
        newclass.setTax(.10);

        System.out.println("The cost of the itme is " + newclass.getCost() + "while the tax of the item is " + newclass.getTax() + "
        This item for sale is "+ newclass.getItemForSale() + "and the nu,ber of items there are for sale is " 
        + newclass.getNumberOfItems() + "The total cost of the item is" + newclass.getFullValue());


       

    }
}
