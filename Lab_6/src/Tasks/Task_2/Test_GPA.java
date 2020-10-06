package Tasks.Task_2;
import Tasks.Students;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test_GPA
{
    public static void main(String[] args)
    {
        List<Students> students = new ArrayList<>();
        Comparator CompareGPA=new CompareGPA();
        Students Student1 = new Students(7, "Саркисян",4.1);
        Students Student2 = new Students(3, "Груздева",4.4);
        Students Student3 =new Students(1, "Нориаки", 5);
        Students Student4 = new Students(5, "Йошикаге",3.7);
        Students Student5 = new Students(9, "Цеппели", 4.8);
        students.add(Student1);
        students.add(Student2);
        students.add(Student3);
        students.add(Student4);
        students.add(Student5);
        SortingStudentsByGPA.GPASort(students, CompareGPA);
        System.out.println("\n\tБыстрая сортировка по итоговым баллам:");
        for (Students s: students)
        {
            System.out.println(s);
        }
    }
}
