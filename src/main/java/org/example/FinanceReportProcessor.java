package org.example;

import java.util.ArrayList;
public class FinanceReportProcessor {
    public static FinanceReport getFirstSymbolOfLastname(char symbol, FinanceReport financeReport){
        ArrayList<Payment> sorted = new ArrayList<>();
        for (int i = 0; i < financeReport.getPayments().length; i++) {
            if (financeReport.getPaymentByIndex(i).getFullName().charAt(0) == symbol) {
                sorted.add(financeReport.getPaymentByIndex(i));
            }
        }
        Payment[] newPayments = new Payment[sorted.size()];
        newPayments = sorted.toArray(newPayments);
        return new FinanceReport(financeReport.getName(), financeReport.getDay(), financeReport.getMonth(), financeReport.getYear(), newPayments);

    }

    public static FinanceReport allPayments(int value, FinanceReport financeReport){
        ArrayList<Payment> sorted = new ArrayList<>();
        for (int i = 0; i < financeReport.getPayments().length; i++) {
            if(financeReport.getPaymentByIndex(i).getSumPayment() < value){
                sorted.add(financeReport.getPaymentByIndex(i));
            }
        }
        Payment[] newPayments = new Payment[sorted.size()];
        newPayments = sorted.toArray(newPayments);
        return new FinanceReport(financeReport.getName(), financeReport.getDay(), financeReport.getMonth(), financeReport.getYear(), newPayments);
    }
}
