package Task_1;

public class Complex
{
    private int real;
    private int image;
    public Complex() {}
    public Complex(int real, int image)
    {
        this.real = real;
        this.image = image;
    }
    public void setReal(int real)
    {
        this.real = real;
    }
    public void setImaginary(int image)
    {
        this.image = image;
    }
    public int getReal()
    {
        return real;
    }
    public int getImaginary()
    {
        return image;
    }
    @Override
    public String toString()
    {
        return "Complex number:\nReal part = " + real +
                "\tImaginary part = " + image;
    }
}
