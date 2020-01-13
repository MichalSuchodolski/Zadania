package Methods;


import ObjectsAndPackets.Human;

public class MethodsExercises {

    public static void main(String[] args) {
        System.out.println(getMyAge());
        System.out.println(getMyName());
        printMathEquationResults(5, 7);
        System.out.println(isEven(8));
        System.out.println(couldDivideBy3and5(15));
        System.out.println(ThirdPow(4));
        System.out.println(sqrt(4));
        System.out.println(canConstructRightAngledTriangle( 6, 10, 8));


    }


    private static int getMyAge() {
        return 30;
    }

    private static String getMyName() {
        return "Michał";
    }

    private static void printMathEquationResults(double arg1, double arg2) {
        System.out.println(arg1 + arg2);
        System.out.println(arg1 - arg2);
        System.out.println(arg1 * arg2);

    }

    private static boolean isEven(double liczba) {
        return liczba % 2 == 0;
    }

    private static boolean couldDivideBy3and5(double liczba) {
        return liczba % 3 == 0 && liczba % 5 == 0;
    }

    private static double ThirdPow(double liczba) {
        return Math.pow(liczba, 3);
    }

    private static double sqrt(double liczba) {
        return Math.sqrt(liczba);
    }

    private static boolean canConstructRightAngledTriangle(double number1, double number2, double number3) {
        if (number1 < 0 || number2 < 0 || number3 < 0) {
            return false;
        }

        double theLongest = number1;
        double side1 = number2;
        double side2 = number3;

        if (number2 > number1 && number2 > number3) {
            theLongest = number2;
            side1 = number1;
            side2 = number3;
        } else if (number3 > number1 && number3 > number2) {
            theLongest = number3;
            side1 = number1;
            side2 = number2;
        }
        return side1 * side1 + side2 * side2 == theLongest * theLongest;
    }


}

