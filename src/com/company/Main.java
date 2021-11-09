package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            int n1, n2;
            Scanner input = new Scanner(System.in);
            System.out.println("enter your of education");
            n1 = input.nextInt();
            System.out.println("enter your total bagrut grade");
            n2 = input.nextInt();
            if ((n1 > 15) || (n2 > 90 && n1 > 12)) {
                System.out.println("great job!!!!!");
                System.out.println("congratulation," + " you have accepted to pilot");
            }
            else
                System.out.println("rejected");
        }

    }
}
