import java.lang.*;

public class Book
{
    private String author;
    private String name;
    private int year;
    private int pages;

    Book (String a, String n, int y, int p)
    {
        this.author=a;
        this.name=n;
        this.year=y;
        this.pages=p;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
    public void setPages(int pages)
    {
        this.pages=pages;
    }
    public String getAuthor(String author)
    {
        return author;
    }
    public String getName(String name)
    {
        return name;
    }
    public int getYear(int year)
    {
        return year;
    }
    public int getPages(int pages)
    {
        return pages;
    }
    public String toString()
    {
        return "\nAuthor: "+this.author+"\nName of the book: "+this.name+"\nYear of publication: "+this.year+"\nNumber of pages: "+this.pages;
    }
}