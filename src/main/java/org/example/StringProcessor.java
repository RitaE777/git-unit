package org.example;

public class StringProcessor {

    public static String copy(String s, int N) throws Exception {
        if (N < 0) {
            throw new Exception("N < 0");
        }
        String res = "";
        for (int i = 0; i < N; i++) {
            res += s;
        }
        return res;
    }

    public static int entryCount(String s1, String s2) throws Exception {
        if (s1.isEmpty() || s2.isEmpty()) {
            throw new Exception("String is empty");
        }
        int index = 0, count = 0;
        while (true) {
            index = s1.indexOf(s2, index);
            if (index != -1) {
                count++;
                index += s2.length();
            } else {
                break;
            }
        }

        return count;
    }

    public static String remove(String line) throws Exception {
        char result = line.charAt(0);
        int buf = result - '0';
        if (buf == 1) {
            return "Один";
        } else if (buf == 2) {
            return "Два";
        } else return "Три";
    }

    public static StringBuilder deleteEven(StringBuilder line){
        for(int i = 1; i < line.length(); i++){
            line = line.deleteCharAt(i);// считает не с 0 а с 1
        }
        return line;
    }
}

