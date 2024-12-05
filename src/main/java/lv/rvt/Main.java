package lv.rvt;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10);
        System.out.println(counter.value()); // 10

        counter.increase();
        System.out.println(counter.value()); // 11

        counter.decrease();
        System.out.println(counter.value()); // 10

        counter.increase(5);
        System.out.println(counter.value()); // 15

        counter.decrease(3);
        System.out.println(counter.value()); // 12

        counter.increase(-2); // No effect
        System.out.println(counter.value()); // 12

        counter.decrease(-3); // No effect
        System.out.println(counter.value()); // 12
    }
}

    