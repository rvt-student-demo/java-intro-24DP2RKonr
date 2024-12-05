package lv.rvt;

public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.value = 0;
        this.limit = limit;
    }

    public void advance() {
        this.value = (this.value + 1) % this.limit;
    }

    public int value() {
        return this.value;
    }
}

