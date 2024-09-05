package lv.rvt;


import java.util.Scanner;

public class App 

{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
       // System.out.println("Ievadi savu vārdu, uzvārdu un grupu: ");
       // String name = scanner.nextLine();
       // System.out.println("Sveiks " + name);
       //String name = "Ralfs";
       //int age = 20;
       //boolean isOnline = false;
       //System.out.println(name);
       
        System.out.println("Chicken:");
        String chicken = scanner.nextLine();
        System.out.println("Bacon(kg)");
        String bekons = scanner.nextLine();
        System.out.println("Tractor:");
        String traktors = scanner.nextLine();
        System.out.println(chicken);

        System.out.println("And finally, a summary");
        System.out.println(chicken);
        System.out.println(bekons);
        System.out.println(traktors);
       



    }

}
