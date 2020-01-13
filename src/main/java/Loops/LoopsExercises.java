package Loops;

import ObjectsAndPackets.Rectangle;
import Tables.ArrayFactory;

import java.util.Arrays;

public class LoopsExercises extends ArrayFactory  {


    public LoopsExercises(int size) {
        super(size);
    }

    public static void main(String[] args) {
       printFrom0ToN(5);
       printFrom0ToNWithWhileLoop(5);
       printCharPerLine(1234);
       System.out.println(reverse("ciasta"));
       printBinary(21);
       System.out.println(isPalindrome("kajak"));
       printArray(new int[]{1, 2, 3});
       int[] inputArray = new int[]{4, 5, 1, 7, 9};
       System.out.println(Arrays.toString(bubbleSort(inputArray)));
       printArray(inputArray);



        



    }

    private static void printFrom0ToN(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println(i);
        }

    }

    private static void printFrom0ToNWithWhileLoop(int n) {
        int index = 0;
        while (index <= n) {
            System.out.println(index++);
        }
    }

    private static void printCharPerLine(int number) {
        while (number > 0) {
            int reminder = number % 10;
            number /= 10;
            System.out.println(reminder);

        }
    }

    public static String reverse(String word) {
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
        return result;
    }

    public static void printBinary(int number) {
        String binaryReversed = " ";
        while (number > 0) {
            binaryReversed += number % 2;
            number /= 2;
        }
        System.out.println(reverse(binaryReversed));
    }

    public static boolean isPalindrome(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char currentLetter = chars[i];
            char correspondantLetterFromEnd = chars[chars.length - i - 1];
            if (!(currentLetter == correspondantLetterFromEnd)) {
                return false;
            }

        }
        return true;
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            boolean isLastOne = i == array.length - 1;
            if (isLastOne) {
                System.out.print(array[i]);
            } else {
                System.out.println(array[i]);
                System.out.println(" , ");
            }

        }
        System.out.println(" ] ");
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;


                }


            }

        }


        return array;

    }

}
