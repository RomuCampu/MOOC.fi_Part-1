
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        System.out.println("name: ");
        String name = reader.nextLine();
        System.out.println("studentnumber: ");
        String number = reader.nextLine();

        Student student = new Student(name, number);
        list.add(student);

        while (!name.isEmpty()) {
            System.out.println("name: ");
            name = reader.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("studentnumber: ");
            number = reader.nextLine();

            list.add(new Student(name, number));
        }
        for (Student std : list) {
            System.out.println(std);
        }

        System.out.println("Give a search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");

        for (int i = 0; i < list.size(); i++) {
            Student nameToSearch = list.get(i); //get the student object
            String strNameToSearch = nameToSearch.getName(); //gets the student name from the student object
            if (strNameToSearch.contains(searchTerm)) {
                System.out.println(nameToSearch);
            }
        }
    }
}
