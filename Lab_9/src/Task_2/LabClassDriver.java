package Task_2;

public class LabClassDriver {
    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException
    {
        LabClassUI labClassUI = new LabClass();
        labClassUI.addStudent(7, "Momsen",4.1);
        labClassUI.addStudent(3, "Brown",4.4);
        labClassUI.addStudent(1, "Noriaki", 5.0);
        labClassUI.addStudent(5, "Yoshik",3.7);
        labClassUI.addStudent(9, "Zeppeli", 4.8);
        /*labClassUI.addStudent(9, "", 4.8);*/ //EmptyStingException test
        System.out.println("\nUnsorted list of students");
        labClassUI.printOutStudents();
        labClassUI.sortByGPA();
        System.out.println("\nSorted list of students");
        labClassUI.printOutStudents();
        System.out.println("\nSearching student by name");
        System.out.println(labClassUI.searchByName("Momsen")+"\n");
        /*System.out.println("\n"+labClassUI.searchByName("Iero"));*/ //StudentNotFoundException test
    }
}
