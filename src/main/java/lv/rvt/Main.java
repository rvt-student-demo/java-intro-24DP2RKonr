package lv.rvt;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        DecreasingCounter counter1 = new DecreasingCounter(10);
        System.out.println("Part 1:");
        counter1.printValue();    
        counter1.decrement();
        counter1.printValue();    
        counter1.decrement();
        counter1.printValue();    

        DecreasingCounter counter2 = new DecreasingCounter(2);
        System.out.println("\nPart 2:");
        counter2.printValue();    
        counter2.decrement();
        counter2.printValue();    
        counter2.decrement();
        counter2.printValue();    
        counter2.decrement();
        counter2.printValue();    

        DecreasingCounter counter3 = new DecreasingCounter(100);
        System.out.println("\nPart 3:");
        counter3.printValue();    
        counter3.reset();
        counter3.printValue();    
        counter3.decrement();
        counter3.printValue();    
    }
}

    
    