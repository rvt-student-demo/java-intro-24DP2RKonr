package lv.rvt;

public class Main {
    public static void main(String[] args) {
        Time timer = new Time();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

    