package Java2.EMedical;

public class Fentanyl extends Medicine
{
    public void setNumTimes(int NumOfTimes){
        this.numberOfTimes = NumOfTimes;
    }

    public void setName(String medicineName)
    {
        this.name = medicineName;
    }

    public void setEffects(String SideEffects)
    {
        this.sideEffects = SideEffects;
    }

    public void setDate(String ExpireDate)
    {
        this.expirationDate = ExpireDate;
    }

    public void setCost(int Price)
    {
        this.price = Price;
    }



    public int getNumTimes()
    {
        return this.numberOfTimes;
    }

    public String getName(){
        return this.name;
    }

    public String getSideEffects()
    {
        return this.sideEffects;
    }

    public String getExpirationDate()
    {
        return this.expirationDate;
    }

    public int getPrice()
    {
        return this.price;
    }
}
