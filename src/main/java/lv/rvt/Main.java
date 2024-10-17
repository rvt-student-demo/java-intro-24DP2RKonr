package lv.rvt;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int targetNumber = random.nextInt(10) + 1;
        int attempts = 3;

        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess what it is in three tries.");

        for (int i = 0; i < attempts; i++) {
            System.out.print("Enter a guess: ");
            int guess = scanner.nextInt();

            if (guess == targetNumber) {
                System.out.println("RIGHT! You have won the game.");
                return;
            } else {
                int difference = Math.abs(guess - targetNumber);
                if (difference >= 3) {
                    System.out.println("cold");
                } else if (difference == 2) {
                    System.out.println("warm");
                } else if (difference == 1) {
                    System.out.println("hot");
                } else 
                System.out.println("wrong");
            }
        }

        System.out.println("The correct number was " + targetNumber + ".");
        System.out.println("You have lost the game.");

        scanner.close();
    }
}