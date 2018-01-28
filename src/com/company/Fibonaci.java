package com.company;
public class Fibonaci {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        long c;
        for (int i=0; i <= 50; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
