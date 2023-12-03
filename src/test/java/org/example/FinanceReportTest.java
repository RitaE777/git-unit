package org.example;

import org.example.FinanceReport;
import org.example.Payment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanceReportTest {
    private Payment[] payments;
    private FinanceReport buf;
    @BeforeEach
    public void creation(){
        Payment payment0 = new Payment();
        Payment payment1 = new Payment("Zubarev Ivan Ivanovich", 15, 11, 2020, 50000);
        Payment payment2 = new Payment("Kartoska Kartofelina Kartofanovna", 22, 7, 2023, 10000);
        Payment[] payments = new Payment[] {payment0, payment1, payment2};
        payments = new Payment[]{payment0, payment1, payment2};
    }
    @Test
    public void financeReportCopy(){
        FinanceReport financeReport = new FinanceReport("Lastname, name, otchestvo",10, 22, 10, payments);
        FinanceReport copy = new FinanceReport(financeReport);
        assertEquals(financeReport, copy);
        financeReport.setPayment(1, new Payment());
        assertNotEquals(financeReport, copy  );
    }
}