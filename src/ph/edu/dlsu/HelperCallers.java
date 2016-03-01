package ph.edu.dlsu;

import ph.edu.dlsu.SequenceHelpers.*;

public class HelperCallers {

    static void doPowerThree(int number) {
        PowersOfThree powersOfThree = new PowersOfThree();
        powersOfThree.init(number);
        System.out.print(number + " consecutive POWERS OF THREE numbers: ");
        powersOfThree.printElements();
        System.out.println("\nSum of " + number + " consecutive POWERS OF THREE numbers: " + powersOfThree.getSum());
    }

    static void doPowerTwo(int number) {
        PowersOfTwo powersOfTwo = new PowersOfTwo();
        powersOfTwo.init(number);
        System.out.print(number + " consecutive POWERS OF TWO numbers: ");
        powersOfTwo.printElements();
        System.out.println("\nSum of " + number + " consecutive POWERS OF TWO numbers: " + powersOfTwo.getSum());
    }

    static void doFactorial(int number) {
        Factorial factorial = new Factorial();
        factorial.init(number);
        System.out.print(number + " consecutive FACTORIAL numbers: ");
        factorial.printElements();
        System.out.println("\nSum of " + number + " consecutive FACTORIAL numbers: " + factorial.getSum());
    }

    static void doFibonacci(int number) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.init(number);
        System.out.print(number + " consecutive FIBONACCI numbers: ");
        fibonacci.printElements();
        System.out.println("\nSum of " + number + " consecutive FIBONACCI numbers: " + fibonacci.getSum());
    }

    static void doOdd(int number) {
        OddNumbers oddNumbers = new OddNumbers();
        oddNumbers.init(number);
        System.out.print(number + " consecutive ODD numbers: ");
        oddNumbers.printElements();
        System.out.println("\nSum of " + number + " consecutive ODD numbers: " + oddNumbers.getSum());
    }

    static void doEven(int number) {
        EvenNumbers evenNumbers = new EvenNumbers();
        evenNumbers.init(number);
        System.out.print(number + " consecutive EVEN numbers: ");
        evenNumbers.printElements();
        System.out.println("\nSum of " + number + " consecutive EVEN numbers: " + evenNumbers.getSum());
    }

    static void doNatural(int number) {
        NaturalNumbers naturalNumbers = new NaturalNumbers();
        naturalNumbers.init(number);
        System.out.print(number + " consecutive NATURAL numbers: ");
        naturalNumbers.printElements();
        System.out.println("\nSum of " + number + " consecutive NATURAL numbers: " + naturalNumbers.getSum());
    }

}
