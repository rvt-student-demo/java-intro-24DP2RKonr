package lv.rvt;

import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

public class PersonManager {
    public static ArrayList<Person> getPersonList() throws IOException {
        BufferedReader reader = Helper.getReader("persons.csv");

        ArrayList <Person> personList = new ArrayList();
        reader.readLine();
        String list;
        while((list = reader.readLine()) !=null) {
            String[] parts = list.split(", ");
            Person nam = new Person(parts[0], Integer.valueOf(parts[1]), Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
            personList.add(nam);
        }
            return personList;

    }
}
