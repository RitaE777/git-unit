package org.example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {
    @Test
    public void myTest1() throws Exception {
        assertEquals("ABCABCABC", StringProcessor.copy("ABC", 3));
        assertEquals("", StringProcessor.copy("", 4));
        assertEquals("", StringProcessor.copy("ASASA", 0));
    }

    @Test
    public void myTest2() throws Exception{
        assertEquals(4, StringProcessor.entryCount("ABABABAB", "AB"));
        assertEquals(0, StringProcessor.entryCount("ABABABA", "ab"));
        assertEquals(1, StringProcessor.entryCount("ABABAB", "ABABA"));
    }

    @Test
    public void myTest3() throws Exception{
        assertEquals("Один", StringProcessor.remove("1"));
        assertEquals("Два", StringProcessor.remove("2"));
        assertEquals("Три", StringProcessor.remove("3"));
    }

    @Test
    public void myTest4(){
        StringBuilder line1 = new StringBuilder("ABABABAB");
        StringBuilder line2 = new StringBuilder("|       |");
        StringBuilder line3 = new StringBuilder("Please credit my work");
        assertEquals("AAAA", StringProcessor.deleteEven(line1).toString());
        assertEquals("|   |", StringProcessor.deleteEven(line2).toString());
        assertEquals("Pes rdtm ok", StringProcessor.deleteEven(line3).toString());
    }
}