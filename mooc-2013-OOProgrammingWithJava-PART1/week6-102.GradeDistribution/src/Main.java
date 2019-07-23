
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Type exam scores, -1 completes:");

        GradeDistribution grade = new GradeDistribution();

        grade.doSomething(reader);
        grade.printStars();
        grade.printAcceptance();
    }
}