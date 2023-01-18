package Java2;
import java.util.*;


public class ContactList 
{

    public ContactList(String input)
    {
        this.name = input; //this.name refers to whatever is calling name
        //input is just a variable
    }


    String name;//the Public ContactList will only use this becuase it is outside the main function
    int number;
    public static void main(String args[])
    {
        
        ContactList Bobby = new ContactList("Bobby"); //Object called Bobby is calling the Contact because it is the String 
        Bobby.number = 626345678;
        ContactList George = new ContactList("George");
        George.number = 123456789;
        ContactList Leo = new ContactList("Leo");
        Leo.number = 987654321;

        List<ContactList> list1 = new ArrayList();
        list1.add(Bobby);
        list1.add(George);
        list1.add(Leo);
 
        for (ContactList x:list1)   //x = list1[0]
        {
            System.out.println(x.name + x.number);
        }
    }  
    
}
