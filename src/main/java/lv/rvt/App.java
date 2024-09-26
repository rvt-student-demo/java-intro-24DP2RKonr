package lv.rvt;

import java.util.*;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class App 

{
    public static void main( String[] args )
    {
        
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ievadiet skaitli no kura sāks skaitīt:");
        int sk = scanner.nextInt();
        for (int i = sk; i <= 100; i++) {
             System.out.println(i);
            }
        
        }
}
        
     