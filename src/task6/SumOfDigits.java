package task6;

import java.util.Scanner;

public class SumOfDigits {
    public void calculateSumOfDigits() {
        System.out.println("Enter your value:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sumAnswer = (num % 10) + (num / 10) % 10 + (num / 100);
        System.out.println("Sum digits =  " + sumAnswer);

    }
}

