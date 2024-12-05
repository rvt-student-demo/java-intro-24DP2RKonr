package lv.rvt;

public class Main {
        public static void main(String[] args) {
            ConstructorOverload tapeMeasure = new ConstructorOverload("Tape measure");
            ConstructorOverload plaster = new ConstructorOverload("Plaster", "home improvement section");
            ConstructorOverload tyre = new ConstructorOverload("Tyre", 5);
    
            System.out.println(tapeMeasure);
            System.out.println(plaster);
            System.out.println(tyre);
        }
    }
    