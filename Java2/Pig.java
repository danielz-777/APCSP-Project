package Java2;

interface Animal{ //has a bunch of methods that can be called upon thru inheritance 
    public void animalSound(); //interface method: does not have a body, cannot set varaibles
    //also cannot define or create objects here, only methods


    
    //An interface provides a set of specifications that other classes must implement.
    public void sleep();
}

class Pig implements Animal //implements function implements the interface

{
   public void animalSound() 
   {
       System.out.print("The pig saus weewee");
   }




   public static void main(String[] args) {
       Pig mypig = new Pig();
   }
}
