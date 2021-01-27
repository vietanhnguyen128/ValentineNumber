package com.anhnv02;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger inputNumber;
        System.out.println("Check Valentine Number. Type 0 to exit");
        do {
            System.out.print("Number (must > 1): ");
            try {
                inputNumber = scanner.nextBigInteger();
            } catch (InputMismatchException e) {
                System.out.println("Not a number!");
                scanner.nextLine();
                continue;
            }

            if (inputNumber.compareTo(BigInteger.valueOf(0)) == 0)
                break;
            if (inputNumber.compareTo(BigInteger.valueOf(0)) == -1) {
                System.out.println("Invalid number: smaller than 1");
                continue;
            }

            ValentineNumber instance = new ValentineNumber(inputNumber.toString());
            if (instance.isValid())
                System.out.println("YES");
            else System.out.println("NO");
        } while (true);

        System.out.println("END");
    }
}
