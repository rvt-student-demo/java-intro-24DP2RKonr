package lv.rvt;

public class Time {
    private ClockHand hundredths;
    private ClockHand seconds;

    public Time() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundredths.advance();
        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", this.seconds.value(), this.hundredths.value());
    }
}

