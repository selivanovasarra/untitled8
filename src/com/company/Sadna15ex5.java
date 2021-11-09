package com.company;

import java.util.Scanner;

public class Sadna15ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        System.out.println("enter three numbers");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        if (n1 == n2 && n2 == n3 && n3 == n1)
            System.out.println("all equal");
        if (n1 != n2 && n2 != n3 && n3 != n1)
            System.out.println("not equal");
        else
            System.out.println("only two are equal");
    }
}