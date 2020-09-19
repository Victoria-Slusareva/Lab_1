import java.lang.*;

public class Author
{
    private String name;
    private String email;
    private char gender;
    public Author(String n, char g, String e)
    {
        this.name=n;
        this.email=e;
        this.gender=g;
    }
    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public char getGender()
    {
        return gender;
    }
    public String toString()
    {
        return this.name+" ("+this.gender+") at "+this.email;
    }
}
