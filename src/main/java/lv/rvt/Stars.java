package lv.rvt;

import java.util.*;

public class Stars {
    
    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            i++;
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSquare(int size)  {
        int i = 0;
        while (i < size) {
            printStars(size);
            i++;
        }
        
    }
}
        

