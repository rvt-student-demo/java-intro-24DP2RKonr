package lv.rvt;

import java.util.*;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class App 

{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

                int count = 0;
                int sum = 0;
        
                while (true) {
                    System.out.print("Give a number:\n");
                    int number = scanner.nextInt();
        
                    if (number == 0) {
                        break;
                    }
        
                    count++;
                    sum += number;
                }
        
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + sum);
                scanner.close();
            }
        }
     