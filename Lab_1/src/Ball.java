import java.lang.*;

public class Ball
{
    private String color;
    private double diameter;
    private String type;

    public Ball (String t, double d, String c)
    {
        this.type = t;
        this.diameter = d;
        this.color = c;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public void setDiameter(double diameter)
    {
        this.diameter=diameter;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public String getType(String type)
    {
        return type;
    }
    public double getDiameter(double diameter)
    {
        return diameter;
    }
    public String getColor(String color)
    {
        return color;
    }
    public String toString()
    {
        return "\nType: "+this.type+"\nDiameter in cm: "+this.diameter+"\nColor: "+this.color;
    }
}