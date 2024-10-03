package lv.rvt;

import java.util.*;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class App 

{
    public class Main {

        public static void main(String[] args) {
            PrintUntilNumber(5);
        }
    
        public static void PrintUntilNumber(int first) {
            int i = 1;
            while (i != first + 1) {
                System.out.println(i);
                i++;
            }
        }
    }
    
            }