package application;

public class Calculator {

    //***************Simple methods************************

    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;

    }

    public int multiplication(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {
        return a / b;
    }

    public double squareRoot(int a) {
        return Math.sqrt(a);
    }

    public double power (int base, int component) {
        return Math.pow(base, component);
    }


    //TODO add method for subtraction

    //TODO add method for multiplication

    //TODO add method for division

    //TODO add method for square root (use Math class)

    //TODO add method for x^2

    //***************Medium methods************************

    //TODO (*) |average value| add method which calculate average value of 3 numbers

    public static double avr(double a, double b, double c) {
        return(a + b + c) / 3;
    }


    //TODO (*) |even or odd| add method which get 1 number as parameter and return true if it even, and false - if odd

    public static boolean evenOdd(int a) {
        return a % 2 == 0;
    }

    //TODO (*) |biggest value| add method which get 2 number as parameters and return bigger of them, or 0 if they equals
    public static int biggestValue (int a, int b) {
        if (a==b){
            return 0;
        }
        return a>b ? a : b;

    }

    //***************Hard methods************************

    //TODO (**) |addition with multiple parameters| add method which return sum of any quantity of parameter

    public static int sumAll(int...numbers){

        int result = 0;
        for(int i = 0 ; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        return result;
    }

    //TODO (*) |divide by zero case| add method for division (check division by zero case
    // - if we try to divide by zero - return -100;
    public static float divide (int a, int b) {
        if (b==0){
            return -100;
        }
        return a/b;

    }


}







