package runner;

import task1.PartA;
import task1.PartB;
import task1.PartC;
import task10.AverageExample;
import task2.Task2Answers;
import task3.SqrtExample;
import task4.SqrtExampleForAnyNumbers;
import task5.Modulo;
import task6.SumOfDigits;
import task7.CastingToInt;
import task9.ArithmeticExamples;

public class HomeworkRunner {
    public static void main(String[] args) {
        //Task1Runner
        System.out.println("Task1" + '\n' + "Part A: ");
        PartA partA = new PartA();
        partA.giveMeAnswerA();

        System.out.println('\n' + "Part B: ");
        PartB partB = new PartB();
        partB.giveMeAnswerB();

        System.out.println('\n' + "Part C: ");
        PartC partC = new PartC();
        partC.giveMeAnswerC();
        System.out.print('\n');

        //Task2Runner
        System.out.println("Task2");
        Task2Answers task2Answers = new Task2Answers();
        task2Answers.giveMeDiscount();
        System.out.print('\n');

        //Task3Runner
        System.out.println("Task3");
        SqrtExample sqrtExample = new SqrtExample();
        sqrtExample.hypotenuse();
        System.out.print('\n');

        //Task4Runner
        System.out.println("Task4");
        SqrtExampleForAnyNumbers sqrtExampleForAnyNumbers = new SqrtExampleForAnyNumbers();
        sqrtExampleForAnyNumbers.anyHypotenuse();
        System.out.print('\n');

        //Task5Runner
        System.out.println("Task5");
        Modulo modulo = new Modulo();
        modulo.valueOfDivision();
        System.out.print('\n');

        // Task6Runner
        System.out.println("Task6");
        SumOfDigits sumOfDigits = new SumOfDigits();
        sumOfDigits.calculateSumOfDigits();
        System.out.print('\n');

        //Task7Runner
        System.out.println("Task7");
        CastingToInt castingToInt = new CastingToInt();
        castingToInt.GetMeIntValue();
        System.out.print('\n');


        //Task8Runner  https://stackoverflow.com/questions/48160580/why-2147483647-1-is-actually-2147483648
        System.out.println("Task8");
        int z = 2147483647+1;
        System.out.println(z);
        System.out.print('\n');


        //Task9Runner
        System.out.println("Task9");
        ArithmeticExamples arithmeticExamples = new ArithmeticExamples();
        arithmeticExamples.giveMeAnswers();
        System.out.print('\n');

        //Task10Runner
        System.out.println("Task10");
        AverageExample averageExample = new AverageExample();
        averageExample.average();
        System.out.print('\n');
    }
}
