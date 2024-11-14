package lv.rvt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Person> persons = new ArrayList<>();

        System.out.println("Current directory: " + System.getProperty("user.dir"));

        try (BufferedReader br = new BufferedReader(new FileReader("/workspaces/java-intro-24DP2RKonr/src/main/resources/persons.csv"))) {
            String line;
            br.readLine(); // Skip header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String name = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                double weight = Double.parseDouble(data[2].trim());
                double height = Double.parseDouble(data[3].trim());

                persons.add(new Person(name, age, height, weight));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        for (Person person : persons) {
            System.out.println(person);
        }

        double totalAge = 0;
        for (Person person : persons) {
            totalAge += person.getAge();
        }
        double averageAge = persons.isEmpty() ? 0 : totalAge / persons.size();
        System.out.println("Average age: " + averageAge);
    }
}
