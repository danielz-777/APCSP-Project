package Java2.StoreBuyingProject;

public class Author 
{
    private String Title;
    private String authorName;
    private String publishDate;
    private String publisher;


    //setters

    public void setTitle(String titleBook)
    {
        this.Title = titleBook;
    }

    public void setAuthorName(String Name)
    {
        this.authorName = Name;

    }

    public void setpublishDate(String Date)
    {
        this.publishDate = Date;
    }

    public void setPublisher(String publisherOfBook)
    {
        this.publisher = publisherOfBook;
    }




    //getters

    public String getTitle()
    {
        return this.Title;
    }
    
    public String getAuthorName()
    {
        return this.authorName;

    }

    public String getPublisherDate()
    {
        return this.publishDate;

    }

    public String getPublisher()
    {
        return this.publisher;
    }
    

    public static void main(String[] args) 
    {
        
    }
}
