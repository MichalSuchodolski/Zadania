package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args)    {
        System.out.println("Enter the number:");
        Scanner in = new Scanner(System.in);
        double userInput = 0;

        while (true){
            try{
                userInput = in.nextDouble();
                break;
            }catch (InputMismatchException e){
                System.out.println("Podaj poprawną liczbę! ");
                in.next();
            }
        }
        if (userInput < 0){
            throw new IllegalArgumentException(" Square root of the real number " + userInput + " does not exist ! ");

        }
        System.out.println("Square root of a number " + userInput + " is " + Math.sqrt(userInput));


    }
}
