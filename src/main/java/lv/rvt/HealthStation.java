package lv.rvt;

import java.lang.reflect.Field;

public class HealthStation {

    private int weighingsPerformed;

    public HealthStation() {
        this.weighingsPerformed = 0;
    }

    public double weigh(Person person) {
        this.weighingsPerformed++;
        return getWeight(person);
    }

    public void feed(Person person) {
        double currentWeight = getWeight(person);
        setWeight(person, currentWeight + 1);
    }

    public int weighings() {
        return this.weighingsPerformed;
    }

    private double getWeight(Person person) {
        try {
            Field weightField = person.getClass().getDeclaredField("weight");
            weightField.setAccessible(true);
            return weightField.getDouble(person);
        } catch (Exception e) {
            throw new RuntimeException("Unable to access the weight field", e);
        }
    }

    private void setWeight(Person person, double newWeight) {
        try {
            Field weightField = person.getClass().getDeclaredField("weight");
            weightField.setAccessible(true);
            weightField.setDouble(person, newWeight);
        } catch (Exception e) {
            throw new RuntimeException("Unable to set the weight field", e);
        }
    }
}
