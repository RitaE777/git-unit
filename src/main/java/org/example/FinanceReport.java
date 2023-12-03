package org.example;

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
        this.name = financeReport.name;
        this.day = financeReport.day;
        this.month = financeReport.month;
        this.year = financeReport.year;
        int thisPaymentLength = financeReport.payments.length;
        this.payments = new Payment[thisPaymentLength];
        for (int i = 0; i < financeReport.payments.length; i++) {
            this.payments[i] = financeReport.payments[i];
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

    public Payment getPayment(int index){
        return payments[index];
    }
    public void setPayment(int i, Payment payment) {
        payments[i] = payment;
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


}
