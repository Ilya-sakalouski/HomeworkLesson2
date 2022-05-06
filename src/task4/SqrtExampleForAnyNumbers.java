package task4;

import java.util.Scanner;

public class SqrtExampleForAnyNumbers {
    public void anyHypotenuse() {
        final int powerOfNumber = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int x = scanner.nextInt();
        System.out.println("Enter second value");
        int y = scanner.nextInt();

        double answer = Math.sqrt(Math.pow(x, powerOfNumber) + Math.pow(y, powerOfNumber));
        System.out.println(answer);
    }
}
