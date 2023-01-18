package Java2;
public class Register {

    private void basicTest(){
        Transaction t = new Transaction();
        //this. function turns into t, corresponds to object t


        System.out.println(t.getItems());
        System.out.println("Subtotal: " + t.getSubtotal());
        System.out.println("Taxes: " + t.getTaxes());
        System.out.println("Total: " + t.getTotal());
    }    

    private void sale1(){
        Transaction t = new Transaction();
        t.addItem("Milk", 4.50);
        t.addItem("Apple", 2.00);
        t.addItem("Minigun", 47500.70);

        System.out.println(t.getItems());
        System.out.println("Subtotal: " + t.getSubtotal());
        System.out.println("Taxes: " + t.getTaxes());
        System.out.println("Total: " + t.getTotal());
    }
    
    private void sale2(){
        Transaction t = new Transaction();
        t.addItem("Eyeliner", 7.50);
        t.addItem("Asphalt", 218.33);
        t.addItem("Jackhammer", 2700.70);
        t.addItem("Orange", 3.32);

        System.out.println(t.getItems());
        System.out.println("Subtotal: " + t.getSubtotal());
        System.out.println("Taxes: " + t.getTaxes());
        System.out.println("Total: " + t.getTotal());
    }
    
    public static void main(String[] args){
        Register reg = new Register();
        reg.basicTest();
        reg.sale1();
        reg.sale2();
    }
}

