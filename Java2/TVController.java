package Java2;

public class TVController 
{
    

    public static void main(String[] args)
    {
        TV flatscreen = new TV();
        System.out.println("Volume =: " + flatscreen.getVolume());
        System.out.println("currentChannel =: " + flatscreen.getCurrentChannel());
        System.out.println("previousChannel =: " + flatscreen.getPreviousChannel());



        flatscreen.setChannel(10);
        flatscreen.setVolume(35);

       
        System.out.println("Volume =: " + flatscreen.getVolume());
        System.out.println("currentChannel =: " + flatscreen.getCurrentChannel());
        System.out.println("previousChannel =: " + flatscreen.getPreviousChannel());



        flatscreen.setChannel(100);
        flatscreen.setVolume(55);

        
        System.out.println("Volume =: " + flatscreen.getVolume());
        System.out.println("currentChannel =: " + flatscreen.getCurrentChannel());
        System.out.println("previousChannel =: " + flatscreen.getPreviousChannel());



       
    }


    









}
