package task1;

public class PartB {
    public void giveMeAnswerB() {
        int firstPrice = 20;
        int secondPrice = 30;
        int amountA = 7;
        int amountB = 1;
        double discount = 0.5;

        double fullPriceA =  ((firstPrice * amountA) - (firstPrice * amountA * discount));
        double fullPriceB = secondPrice * amountB;
        double fullPrice = fullPriceA + fullPriceB;

        System.out.println("Full price = " + fullPrice);
    }
}
