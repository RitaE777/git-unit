package org.example;

import java.util.Arrays;
import java.util.Objects;

public class FinanceReport {
    private Payment[] payments;
    private String name;
    private int day;
    private int month;
    private int year;
    public FinanceReport(String name, int day, int month, int year, Payment[] payments){
        this.name = name;
        this.day = day;
        this.month = month;
        this.year = year;
        this.payments = payments;
    }


    public FinanceReport(FinanceReport financeReport) {
        name = financeReport.getName();
        day = financeReport.getDay();
        month = financeReport.getMonth();
        year = financeReport.getYear();
        int size = financeReport.getPaymentCount();
        payments = new Payment[size];
        //почему достаточно вызвать метод financeReport.getPaymentByIndex(i) а не вручную создавать палтежи через new Payment
        for(int i = 0; i < size; i++){
            payments[i] = financeReport.getPaymentByIndex(i);
        }

    }
    public void setPayments(Payment[] payments) {
        this.payments = payments;
    }

    public Payment[] getPayments() {
        return payments;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public int getPaymentCount(){
        return payments.length;
    }
    public Payment getPaymentByIndex(int index){
        return payments[index];
    }
    public void setPayment(Payment payment, int number){
        payments[number] = payment;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(String.format("Автор: %s, дата: %d.%d.%d, Платежи:\n", name, day, month, year));
        for(int i = 0; i < payments.length; i++){
            String str = String.format("\tПлательщик: %s, дата: %d.%d.%d сумма: %d руб. %d коп.,\n", payments[i].getFullName(), payments[i].getDay(), payments[i].getMonth(), payments[i].getYear(), payments[i].getSumPayment() / 100, payments[i].getSumPayment() % 100);
            string.append(str);
        }
        return string.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinanceReport that = (FinanceReport) o;
        return day == that.day && month == that.month && year == that.year && Arrays.equals(payments, that.payments) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, day, month, year);
        result = 31 * result + Arrays.hashCode(payments);
        return result;
    }
}
