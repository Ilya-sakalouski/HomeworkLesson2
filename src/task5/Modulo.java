package task5;

import java.util.Scanner;

public class Modulo {
    public void valueOfDivision() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value");
        int q = sc.nextInt();
        System.out.println("Enter second value");
        int w = sc.nextInt();
        int wholePart = q / w;
        int fraction = q % w;
        System.out.println("Whole part = " + wholePart + "; fraction part = " + fraction + ".");
    }
}
