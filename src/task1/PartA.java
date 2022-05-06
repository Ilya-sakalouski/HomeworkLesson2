package task1;

public class PartA {
    public void giveMeAnswerA() {
        int firstPrice = 20;
        int secondPrice = 30;
        int amountA = 10;
        int amountB = 2;
        double discount = 0.15;

        double fullPriceA =  ((firstPrice * amountA) - (firstPrice * amountA * discount));
        double fullPriceB = secondPrice * amountB;
        double fullPrice = fullPriceA + fullPriceB;

        System.out.println("Full price = " + fullPrice);
    }
}
