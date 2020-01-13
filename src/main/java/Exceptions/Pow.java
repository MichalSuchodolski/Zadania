package Exceptions;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Pow {
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        double userInput = 0;
        double userInput1 = 0;

        while (true) {
            try {

                userInput = in.nextDouble();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Enter the correct data!");
                in.nextInt();
            }


        }
        while (true) {
            try {
                System.out.println("Enter the specify the size of the might of:");
                userInput1 = in.nextDouble();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Enter the correct data!");
                in.nextInt();
            }


        }
        if (userInput < 0) {
            throw new IllegalArgumentException(" Exponentiation of a real number " + userInput + " is impossible ! ");


        } else {
            if (userInput1 < 0)
                throw new IllegalArgumentException(" Exponentiation of a real number " + userInput1 + " is impossible ! ");
        }

        System.out.println(+ userInput + " raised to pow " + userInput1 + " = " + Math.pow(userInput, userInput1));
    }
}
