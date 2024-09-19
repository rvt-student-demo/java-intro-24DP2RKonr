package lv.rvt;

import java.util.*;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class App 

{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Give a number: ");

       int value = Integer.valueOf(scanner.nextLine());

       while (true) {
        System.out.print("Give a number: ");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Unsuitable number");
        } else if (number == 0) {
            break;
        } else {
            System.out.println(number * number);
        }
    }
    
    scanner.close();
}
}