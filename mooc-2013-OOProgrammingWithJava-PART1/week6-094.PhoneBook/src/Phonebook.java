
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> contacts = new ArrayList<Person>();

    public void add(String name, String number) {
        contacts.add(new Person(name, number));
    }

    public void printAll() {
        for (Person pers : contacts) {
            System.out.println(pers);
        }
    }

    public String searchNumber(String name) {
        for (Person prs : contacts) {
            if (prs.getName().equals(name)) {
                return prs.getNumber();
            }
        }
        return "number not known";
    }
}
