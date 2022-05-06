package task9;

public class ArithmeticExamples {
    public void giveMeAnswers() {
        int x = 5, y = 7, z = 0, k = 9;

        System.out.println("First answer is: " + firstAnswer(x, y));
        System.out.println("Second answer is: " + secondAnswer(x));
        System.out.println("Third answer is: " + thirdAnswer(x, z));
    }

    int firstAnswer(int x, int y) {
        return x * x + y * y;
    }

    int secondAnswer(int x) {
        return (int) Math.pow(x, 3);
    }

    String thirdAnswer(int x, int z) {

        String s = "Can not be divided by 0 !!!";
        try {
            int k = x / z;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return s;
    }
}
