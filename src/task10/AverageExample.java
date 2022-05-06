package task10;

public class AverageExample {
    public void average() {
        int[] listOfValues = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sumInts = 0;

        for (int i : listOfValues) {
            sumInts += i;
        }
        int intResult = sumInts / listOfValues.length;

        int q = 0, w = 1, e = 2, r = 3, t = 4, y = 5, u = 6, o = 7, p = 8, g = 9;
        double d = 5.67;
        double doubleResult = (q+w+e+r+t+y+u+o+p+g+d)/11;

        System.out.println("Int average:  " + intResult);
        System.out.println("Double average:  " + doubleResult);
    }
}
