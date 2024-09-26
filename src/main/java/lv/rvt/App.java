package lv.rvt;

import java.util.*;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class App 

{
    public static void main( String[] args )
    { 
        Scanner scanner = new Scanner(System.in);
            System.out.println("Give a number: ");
            int number = scanner.nextInt();  
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                 factorial *= i;
             }
            System.out.println("Factorial: " + factorial);  
            scanner.close();  
            }
        }   