package Task_2;

import java.lang.*;

public class Student implements Comparable<Student>
{
    int iDNumber;
    String name;
    double grade;
    public Student(int iDNumber, String name, double grade) throws EmptyStringException
    {
        if(name.isEmpty())
            throw new EmptyStringException("Name can not be an empty string");
        this.iDNumber = iDNumber;
        this.name = name;
        this.grade = grade;
    }
    public int getIDNumber()
    {
        return iDNumber;
    }
    public String getName()
    {
        return name;
    }
    public double getGrade()
    {
        return grade;
    }
    @Override
    public String toString()
    {
        return "ID: " + this.iDNumber + "\t Name: " + this.name + "\t\tAverage grade: " + this.grade;
    }
    @Override
    public int compareTo(Student o)
    {
        if (this.getGrade() > o.getGrade())
            return -1;
        else if (this.getGrade() < o.getGrade())
            return 1;
        else
            return 0;
    }
}
