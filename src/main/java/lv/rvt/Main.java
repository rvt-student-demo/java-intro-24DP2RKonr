package lv.rvt;

import java.util.*;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Automobilis auto = new Automobilis("BMW", 120);
        Laiva laiva = new Laiva("Yamaha", 30);

        System.out.println(auto.kustibasVeids());
        System.out.println(laiva.kustibasVeids());
    }
}



    
