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
        while (true) {
            int number = scanner.nextInt(); 
            if (number == -1) {  
                break; 
    
            }
            Sum = Sum + number;
        }
        System.out.println("Thx! Bye!");  
            System.out.println("Sum: " + Sum);
    }
}