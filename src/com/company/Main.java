
package com.company;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
      //  System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();
//        int a=1;
//        int b=-4;
//        int c = 2;
        double x1 = (-b+sqrt(b*b-4*a*c)/(2*a));
        double x2 = (-b-sqrt(b*b-4*a*c)/(2*a));
        System.out.println(x1 + " " + x2);

	// write your code here
    }
}
