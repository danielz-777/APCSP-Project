package Java2;

public class Centipede extends Animal
{
    int antenna;
    

    public String Noise()
    {
        return "crawl";
    }
    
    public static void main(String args[])
    {
        Centipede joe = new Centipede();
        joe.eyes = 2;
        joe.limbs = 30;
        joe.tail = true;
        joe.fur = "Hair on Antenna";
        joe.antenna = 2;

        System.out.println("My centipede is joe and he has " + joe.eyes +
        " eyes " + joe.ears + " ears " + joe.limbs + " limbs " + joe.tail + " tail "
        + joe.fur + joe.antenna + " antenna" + "He even makes this noise " + joe.Noise() );


    }



}
