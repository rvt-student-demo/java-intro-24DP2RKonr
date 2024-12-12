package lv.rvt;

import java.util.*;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

public class Main {

public static void main(String[] args) {
 
    SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);
        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);
        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        } else {
            System.out.println("not equals");
        }
        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);
        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");
        } else {
            System.out.println("not equals");
        }
        Person niks = new Person("Leo", date, 62, 9);
        if(niks.equals(leo)){
            System.out.println("twins");
        }
}
}
