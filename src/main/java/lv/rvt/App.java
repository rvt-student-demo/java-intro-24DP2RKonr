package lv.rvt;

import java.util.*;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class App 

{
    public static void main( String[] args )
    { 
        Scanner scanner = new Scanner(System.in);
        
            System.out.println("How many times?");
            int times = scanner.nextInt();
            int count = 0;
            while (count < times) {
                printText();
                count++;
            }
        }
        public static void printText() {
            System.out.println("In a hole in the ground there lived a method");
        }
    }