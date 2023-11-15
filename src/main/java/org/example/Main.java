package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception{
        Scanner in = new Scanner(System.in);
        int task;
        do {
            System.out.println("Select number for the task: ");
            System.out.println("If you want to finish pick 0");
            System.out.println("Task1: Basics");
            task = in.nextInt();
            switch(task){
                case 1 -> {
                    String s1 = "Ritka Abu Banditka is the best";
                    String s2 = "t";
                    int N = 5;
                    StringProcessor.copy(s1, N);
                    int count = StringProcessor.entryCount(s1, s2);
                    System.out.println("Number of occurrences of the second line in the first " + count);
                    String line1 = "1";
                    String line2 = "2";
                    String line3 = "3";
                    System.out.println("1 - " + StringProcessor.remove(line1));
                    System.out.println("2 - " + StringProcessor.remove(line2));
                    System.out.println("3 - " + StringProcessor.remove(line3));
                    StringBuilder line = new StringBuilder("Please credit my work");
                    System.out.println(StringProcessor.deleteEven(line));



                    StringBuilder line0 = new StringBuilder("ABABABAB");
                    System.out.println("AAAA " + StringProcessor.deleteEven(line0).toString());
                }
            }
        }while(task != 0);
    }
}