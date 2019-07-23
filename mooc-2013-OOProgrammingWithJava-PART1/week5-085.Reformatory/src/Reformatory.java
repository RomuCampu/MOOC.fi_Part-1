public class Reformatory {
    private int totalTimes;

    public int weight(Person person) {
        // return the weight of the person
        if(person.getWeight() >= 0) {
            totalTimes++;
        }
        return person.getWeight();
        
    }
    
    public void feed(Person person) {
        person.setWeight(this.weight(person) + 1);
    }
    
    public int totalWeightsMeasured() {
       // System.out.println(totalTimes +  " Hello");
        return totalTimes;
    }
}
