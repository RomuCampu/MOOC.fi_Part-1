public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter counter = new Counter(5, false);
        //counter.decrease();
        //counter.decrease();
        counter.increase(3);
        System.out.println(counter.value());
        //Counter newCounter = new Counter();
        //System.out.println(newCounter.value());
    }
}
