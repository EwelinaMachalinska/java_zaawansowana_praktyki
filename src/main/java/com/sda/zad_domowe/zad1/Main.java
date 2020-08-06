package com.sda.zad_domowe.zad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    System.out.println("Enter an integer to reverse");
        int input = scanner.nextInt();

        int reverseNo = 0;
    while(input!=0){
            reverseNo = reverseNo * 10;
            reverseNo = reverseNo + input%10;
            input = input/10;
        }

    System.out.println("Reverse of the number is " + reverseNo);

    }
}
