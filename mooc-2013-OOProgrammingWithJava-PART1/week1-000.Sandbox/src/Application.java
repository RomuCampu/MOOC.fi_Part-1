// This is not an exercise but a "sandbox" where you can freely test
// whatever you want

public class Application {

    public static void main(String[] args) {

        int number = 1;
        System.out.println("a " + addThree(number));
        System.out.println("b " + number);
        number = addThree(number);
        System.out.println("here " + number);

    }

    public static int addThree(int number) {
        System.out.println("c " + number);
        number = number + 3;
        System.out.println("d " + number);
        return number;
    }
    
}


