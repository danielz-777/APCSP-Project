package Java2.StoreBuyingProject;
import java.util.*;
public class Store 
{

    
    public static void main(String[] args) 
    {
        Book newBook = new Book();
        newBook.setPages(200);
        newBook.setChapters(10);
    
        newBook.setTitle("Book"); //You can use newBook because Book class extends Author.java
        newBook.setAuthorName("Bob");

        Movie newMovie = new Movie();
        List<String> Actors= new ArrayList<>();
        Actors.add("BOB");
        Actors.add("joe");
        Actors.add("will");
        Actors.add("jill");

        newMovie.setActors(Actors);
        newMovie.setRunTime(100);
        newMovie.setAuthorName("joe");
        newMovie.setTitle("The Movie!");

        System.out.println("Welcome to the Store. The items we sell today are: ");

        System.out.println(newBook.getTitle() + " by " + newBook.getAuthorName() + " with " + newBook.getPages() + " pages and " + newBook.getChapters() + " Chapters.");
        System.out.println(newMovie.getTitle() + " directed by " + newMovie.getAuthorName() + ", and the actors are " + newMovie.getActors() + " with a " + newMovie.getRunTime() + " minute Runtime");
        
    }



    
}
