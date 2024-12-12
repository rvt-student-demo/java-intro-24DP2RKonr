package lv.rvt;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equals(Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof SimpleDate)) {
            return false;
        }
        SimpleDate otherDate = (SimpleDate) compared;


        if (this.day == otherDate.day
                && this.month == otherDate.month
                && this.year == otherDate.year) {
            return true;
        }


        return false;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
}
