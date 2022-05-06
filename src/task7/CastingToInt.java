package task7;

import java.util.Scanner;

public class CastingToInt {
    public void GetMeIntValue(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter double value using ','");   // Вводить через ЗАПЯТУЮ !!!
        double n = sc1.nextDouble();
        long intValue = Math.round(n);
        System.out.println("Int value of your number : " + intValue);

    }
}
