package lv.rvt;

import java.util.*;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class App 

{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        

        System.out.println(first + " + " + second + " = " + (first+second) );
        System.out.println(first + " - " + second + " = " + (first-second) );
        System.out.println(first + " * " + second + " = " + (first*second) );
        System.out.println(first + " / " + second + " = " + ((double)first/second) );
    }

}
