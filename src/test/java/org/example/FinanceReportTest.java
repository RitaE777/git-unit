package org.example;

import org.example.FinanceReport;
import org.example.Payment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanceReportTest {
    private FinanceReport test;

    @BeforeEach
    public void creation(){
        Payment payment0 = new Payment("Olya", 22, 7, 2023, 10000);
        Payment payment1 = new Payment("Oleg", 21, 1, 2019, 3001);
        Payment payment2 = new Payment("Zubarev", 15, 11, 2020, 50020);
        Payment payment3 = new Payment("Kartoshka", 22, 7, 2023, 10000);
        Payment[] payments = new Payment[] {payment0, payment1, payment2, payment3};
        test = new FinanceReport("Test", 1, 2, 2002, payments);
    }
    @Test
    public void FinanceReportCopy(){
        FinanceReport copy = new FinanceReport(test);
        copy.setPayment(copy.getPaymentByIndex(2), 1);
        Assertions.assertNotEquals(copy, test);
        System.out.println(test);
        System.out.println(copy);
    }

    @Test
    public void firstSymbol(){
        FinanceReport test1 = FinanceReportProcessor.getFirstSymbolOfLastname( 'K',test);
        assertEquals(1, test1.getPaymentCount());
        FinanceReport test2 = FinanceReportProcessor.getFirstSymbolOfLastname( 'L',test);
        assertEquals(0, test2.getPaymentCount());
        FinanceReport test3 = FinanceReportProcessor.getFirstSymbolOfLastname( 'O',test);
        assertEquals(2, test3.getPaymentCount());
    }

    @Test
    public void allPayments(){
        FinanceReport sumTest1 = FinanceReportProcessor.allPayments(15000, test);
        assertEquals(3,sumTest1.getPayments().length);
        FinanceReport sumTest2 = FinanceReportProcessor.allPayments( 500000, test);
        assertEquals(4,sumTest2.getPayments().length);
        FinanceReport sumTest3 = FinanceReportProcessor.allPayments( 50, test);
        assertEquals(0,sumTest3.getPayments().length);
    }
}