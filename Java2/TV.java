package Java2;

public class TV 
{
    private int currentChannel;
    private int previousChannel;
    private int Volume;

    public int getCurrentChannel()
    {
        return this.currentChannel;
    }

    public int getPreviousChannel()
    {
        return this.previousChannel;
    }

    public int getVolume()
    {
        return this.Volume;
    }

    public void setChannel(int channel)
    {
        this.previousChannel = this.currentChannel;
        this.currentChannel = channel;
    }

    public void setVolume(int volume)
    {
        this.Volume = volume;
    }









    public static void main(String[] args){

    }
}
