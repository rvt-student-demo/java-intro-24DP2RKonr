package lv.rvt;

import java.util.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics allNumbers = new Statistics();
        Statistics evenNumbers = new Statistics();
        Statistics oddNumbers = new Statistics();

        System.out.println("Enter numbers:");
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            allNumbers.addNumber(number);
            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
        }

        System.out.println("Count: " + allNumbers.getCount());
        System.out.println("Sum: " + allNumbers.sum());
        System.out.println("Average: " + allNumbers.average());

        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
    }
}
