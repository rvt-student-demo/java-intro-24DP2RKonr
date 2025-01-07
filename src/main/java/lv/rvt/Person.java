package lv.rvt;

public class Person {
    private String name;
    private int age;
    private double weight;
    private int height;
    private SimpleDate birthday;
    private double bodyMassIndex;



    public Person(String name, SimpleDate bday, int height, double weight) {
        this.name = name;
        this.birthday = bday;
        this.weight = weight;
        this.height = height;

    }
    public Person(String name, SimpleDate date) {
        this.name = name;
        this.birthday = date;
    }
    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.birthday = new SimpleDate(day, month, year);
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }

        if (!(compared instanceof Person)) {
            return false;
        }

        Person comparedPerson = (Person) compared;

        if (this.name == comparedPerson.name
                && this.height == comparedPerson.height
                && this.weight == comparedPerson.weight
                && this.birthday.getYear() == comparedPerson.birthday.getYear()
                && this.birthday.getMonth() == comparedPerson.birthday.getMonth()
                && this.birthday.getDay() == comparedPerson.birthday.getDay()) {
            return true;
        }

        return false;
    }
}