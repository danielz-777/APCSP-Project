package Java2.StoreBuyingProject;
import java.util.*;

public class Movie extends Author
{
    private List<String> actors;
    private int runTime;


    public void setActors(List<String> actorList)
    {
        this.actors = actorList;
    }

    public void setRunTime(int Time)
    {
        this.runTime = Time;
    }

    public List<String> getActors()
    {
        return this.actors;
    }

    public int getRunTime()
    {
        return this.runTime;
    }




    public static void main(String[] args) {
        
    }
}
