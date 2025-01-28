package lv.rvt;

import java.util.*;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);

        System.out.println(juice.getName()); 
        System.out.println(juice); 
        System.out.println(juice.history()); 

        juice.printAnalysis();
    }
}


    
