package ph.edu.dlsu;


public class Main {

    public static void main(String[] args) {
        String input = InputHelper.getInput("Enter number of elements you want to print and add: ");
        int number = Integer.parseInt(input);

        System.out.println("");
        HelperCallers.doNatural(number);
        System.out.println("");
        HelperCallers.doFibonacci(number);
        System.out.println("");
        HelperCallers.doEven(number);
        System.out.println("");
        HelperCallers.doOdd(number);
        System.out.println("");
        HelperCallers.doPowerTwo(number);
        System.out.println("");
        HelperCallers.doPowerThree(number);
        System.out.println("");
        HelperCallers.doFactorial(number);

    }

}
