import java.util.Objects;

public class Payment {

    private String fullName;
    private int datePayment;
    private int day;
    private int month;
    private int year;
    private int sumPayment;
    public void setFullName(){
        this.fullName = fullName;
    }
    public void setDatePayment(){
        this.datePayment = datePayment;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSumPayment(int sumPayment) {
        this.sumPayment = sumPayment;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDatePayment() {
        return datePayment;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getSumPayment() {
        return sumPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return datePayment == payment.datePayment && day == payment.day && month == payment.month && year == payment.year && sumPayment == payment.sumPayment && Objects.equals(fullName, payment.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, datePayment, day, month, year, sumPayment);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "fullName='" + fullName + '\'' +
                ", datePayment=" + datePayment +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", sumPayment=" + sumPayment +
                '}';
    }

    public Payment(String fullName, int datePayment, int day, int month, int year, int sumPayment) {
        this.fullName = fullName;
        this.datePayment = datePayment;
        this.fullName = fullName;
        this.datePayment = datePayment;
        this.day = day;
        this.month = month;
        this.year = year;
        this.sumPayment = sumPayment;
    }

}
