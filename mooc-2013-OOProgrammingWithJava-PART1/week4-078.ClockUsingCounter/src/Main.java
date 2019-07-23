
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: " + seconds);
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("minutes: " + minutes);
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("hours: " + hours);
        int h = Integer.parseInt(reader.nextLine());

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (i < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            i++;
            seconds.next();
            s++;
            if(s%60==0) {
                minutes.next();
                m++;
            }
            if(m%60==0) {
                hours.next();
                m++;
            }
        }
    }
}
