package Java2.Practice;

public class PracticeClass 
{
    private double cost;
    private String item;
    private int numberOfItems;
    private double tax;
    private String placeOfItem;
    



    public void setItemPlace(String ItemPlace)
    {
        this.placeOfItem = ItemPlace;
    }

    public void setCost(double Cost)
    {
        this.cost = Cost;
    }

    

    public void setTax(double Tax)
    {
        this.tax = Tax;
    }

    public void setItem(String ItemForSale)
    {
        this.item = ItemForSale;
    }

    public void setNumberOfItems(int NumItem)
    {
        this.numberOfItems = NumItem;
    }


    public double getCost()
    {
        return cost;
    }

    public String getItemForSale()
    {
        return item;
    }

    public int getNumberOfItems()
    {
        return numberOfItems;
    }

    public double getTax()
    {
        return tax;
    }

    public double getFullValue()
    {
        double sum = cost + cost * tax;
        return sum;
    }
}
