package task1;

public class PartC {
    public void giveMeAnswerC() {
        int firstPrice = 20;
        int secondPrice = 30;
        int amountA = 2;
        int amountB = 3;
        double discount = 0.1;

        double fullPriceA =  ((firstPrice * amountA) - (firstPrice * amountA * discount));
        double fullPriceB = secondPrice * amountB;
        double fullPrice = fullPriceA + fullPriceB;

        System.out.println("Full price = " + fullPrice);
    }
}
