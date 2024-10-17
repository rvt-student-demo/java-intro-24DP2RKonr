package lv.rvt;

public class Stars {
    
    public static void printStars(int number) {
        int i = 0;
        while (i < number) {
            i++;
            System.out.print("*");
        }
    }

    public static void printSquare(int size)  {
        int i = 0;
        while (i < size) {
            printStars(size);
            i++;
        }
        
    }
    public static void printRectangle(int width, int height) {
        for (int r = 0; r<height; r++) {
            printStars(width);
            System.out.println();
        }
    }
    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
            System.out.println();
    }
    }
}

