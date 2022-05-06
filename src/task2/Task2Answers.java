package task2;

public class Task2Answers {
    public void giveMeDiscount(){
        int firstPrice = 20;
        int secondPrice = 30;
        double discount = 0.1;

        double finalDiscount = (firstPrice + secondPrice) * discount;
        double finalSum = (firstPrice + secondPrice) - finalDiscount;

        System.out.println("Your discount = " + finalDiscount);
        System.out.println("Your final sum = " + finalSum);
    }
}
