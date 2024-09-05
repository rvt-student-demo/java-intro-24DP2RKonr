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

       
       System.out.println("Ievadi savu vārdu");
       String name = scanner.nextLine();
       System.out.println("Ievadi savu uzvārdu");
       String uzvards = scanner.nextLine();
       System.out.println("Ievadi savu grupas nosaukumu");
       String grupa = scanner.nextLine();

       System.out.println(name +" "+ uzvards +" "+ grupa);
       



    }

}
