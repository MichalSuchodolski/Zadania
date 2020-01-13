package Zadaniadomowe2;

import java.util.Scanner;

public class szyfrcezara {

    public static void main(String[] args) {
        String input =  szyfrcezara.imputFromUser();
        System.out.println(input);
        String encrypted = szyfrcezara.encrypt(input);
        System.out.println(encrypted);
        String decrypted = szyfrcezara.decrypt(encrypted);
        System.out.println(decrypted);

    }

    public static String imputFromUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your text to encrypt: ");
        String result =  sc.nextLine();
        sc.close();
        return result;
    }



    public static String encrypt (String message) {
        StringBuilder sb = new StringBuilder(message);
        int distance = 5;
        for(int i = 0; i < sb.length(); i++){
            int c = (int)sb.charAt(i);
            if( c + distance > 122){
                c = 31 + (distance - (122 - c));
            }else {
                c += distance;
            }
            sb.setCharAt(i, (char)c);
        }
        return sb.toString();
    }
    public static String decrypt (String message) {
        StringBuilder sb = new StringBuilder(message);
        int distance = 5;
        for(int i = 0; i < sb.length(); i++){
            int c = (int)sb.charAt(i);
            if( c - distance < 32){
                c = 123 - (distance - (c - 32));
            }else {
                c -= distance;
            }
            sb.setCharAt(i, (char)c);
        }
        return sb.toString();
    }


}
