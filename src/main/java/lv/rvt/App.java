package lv.rvt;

import java.util.*;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class App 

{
    public static void main( String[] args )
    { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int Sum = 0;
        int Count = 0;
        int evenCount = 0;
        int oddCount = 0;
        while (true) {
            int number = scanner.nextInt(); 
            if (number == -1) {  
                break; 
    
            }
            Sum = Sum + number;
            Count = Count +1;
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
        }
        System.out.println("Thx! Bye!");  
            System.out.println("Sum: " + Sum);
            System.out.println("Count: " + Count);
            System.out.println("Average: ");
            System.out.println("Even: " + evenCount);
            System.out.println("Odd: " + oddCount);

        }
    }
}