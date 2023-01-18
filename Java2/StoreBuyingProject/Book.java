package Java2.StoreBuyingProject;

public class Book extends Author //extends Author methods
{

    private int pages;
    private String cover;
    private int chapters;

    public void setPages(int NumberOfPages)
    {
        this.pages = NumberOfPages;
    }

    public void setChapters(int NumberOfChapters)
    {
        this.chapters = NumberOfChapters;
    }

    public int getPages()
    {
        return this.pages;
    }

    public int getChapters()
    {
        return this.chapters;
    }

    public void printBook() //void means you aren't returning anything
    //static means the varaibles inside of the method doesn't change (ie. public static void)
    {
        System.out.println(this.getTitle() + " by " + this.getAuthorName() + " with " + this.getPages() + " pages and " + this.getChapters() + " Chapters.");
    }






    public static void main(String[] args) {
        
    }
}
