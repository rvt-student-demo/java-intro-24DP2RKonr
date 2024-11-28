package lv.rvt;


public class HealthStation {

    // Counter for the number of weighings performed
    private int weighingsPerformed;

    public HealthStation() {
        this.weighingsPerformed = 0;
    }

    // Method to weigh a person
    public int weigh(Person person) {
        // Increment the weighings counter
        this.weighingsPerformed++;
        // Return the weight of the person
        return person.getWeight();
    }

    // Method to feed a person
    public void feed(Person person) {
        // Increase the person's weight by 1
        person.setWeight(person.getWeight() + 1);
    }

    // Method to get the number of weighings performed
    public int weighings() {
        return this.weighingsPerformed;
    }
}
