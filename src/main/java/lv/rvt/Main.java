package lv.rvt;

import java.util.*;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;

public class Main {
        public static void main(String[] args) {
            A a = new A();
            B b = new B();
            C c = new C();
    
            a.a();
            b.b();
            c.c();
    
            C inheritedC = new C();
    
            inheritedC.a();
            inheritedC.b();
            inheritedC.c();
        }
    }
    
