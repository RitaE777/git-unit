package org.example;

import java.util.Objects;

/* какие конструкторы
        for (int i = 0; i < financeReport.payments.length; i++) {
            this.payments[i] = financeReport.payments[i];
        }
         */
public class Payment {

    private String fullName;
    private int day;
    private int month;
    private int year;
    private int sumPayment;
    public void setFullName(){
        this.fullName = fullName;
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
        return day == payment.day && month == payment.month && year == payment.year && sumPayment == payment.sumPayment && Objects.equals(fullName, payment.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, day, month, year, sumPayment);
    }

    @Override
    public String toString() {
        return "org.example.Payment{" +
                "fullName='" + fullName + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", sumPayment=" + sumPayment +
                '}';
    }

    public Payment(String fullName, int day, int month, int year, int sumPayment) {
        this.fullName = fullName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.sumPayment = sumPayment;
    }


}
