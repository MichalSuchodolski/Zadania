package SimpleTypes;

import Loops.LoopsExercises;

import java.util.Scanner;

public class SimpleTypesExercise {
    public static void main(String[] args) {
        //printBinaryEnteredByUser();
        //instantiateArray();
        reversAndisPalindrome();


    }

    private static void printBinaryEnteredByUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj liczbę całkowitą ");
        LoopsExercises.printBinary(scanner.nextInt());
    }

    private static void instantiateArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Podaj długość tablicy");
        int arrayLenght = scanner.nextInt();
        int[] numbers = new int[arrayLenght];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę na " + (i + 1) + " element tablicy");
            numbers[i] = scanner.nextInt();

        }
        LoopsExercises.bubbleSort(numbers);
        LoopsExercises.printArray(numbers);
    }

    public static void reversAndisPalindrome() {

        String word, original = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wyraz:");
        word = in.nextLine();
        int length = word.length();
        for (int i = length - 1; i >= 0; i--)
            original = original+ word.charAt(i);
        if (word.equals(original))
            System.out.println(" Wyraz jest Palindromem");
        else
            System.out.println("Wyraz nie jest Palindromem");

        char[] chars = word.toCharArray();
        for (int currentCharIndex = 0; currentCharIndex < chars.length / 2; currentCharIndex++) {
            char tempChar = chars[currentCharIndex];
            int currentCharFromEndIndex = chars.length - currentCharIndex - 1;
            chars[currentCharIndex] = chars[currentCharFromEndIndex];
            chars[currentCharFromEndIndex] = tempChar;
        }
        String result = " ";
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];

        }
        System.out.println( result);
        System.out.println(length);





    }


}
