package lv.rvt;

import java.util.*;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class App 

{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Norādiet punktus[0-100] ");

        int punkti = Integer.valueOf(scanner.nextLine());

        if (punkti < 0) {
            System.out.println("Grade: Imposible");
        }
        else if (punkti < 49) {
            System.out.println("Grade: failed");
        }
        else if (punkti < 59 ) {
            System.out.println("Grade: 1");
        }
        else if (punkti < 69 ) {
            System.out.println("Grade: 2");
        }
        else if (punkti < 79 ) {
            System.out.println("Grade: 3");
        }
        else if (punkti < 89 ) {
            System.out.println("Grade: 4");
        }
        else if (punkti < 100 ) {
            System.out.println("Grade: 5");
        }
        else if (punkti > 100) {
            System.out.println("Grade: incredible");    
        }   
    }
    
}
