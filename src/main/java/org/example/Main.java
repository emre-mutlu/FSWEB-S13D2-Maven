package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number){

        // mutlak değere çevir
        number = Math.abs(number);
        // stringe çevir
        String stringNumber = String.valueOf(number);
        // stringi parçala
        String[] splitNumber = stringNumber.split("");
        String[] reversedNumber = new String[splitNumber.length];

        for (int i = splitNumber.length-1; i >= 0; i--){
            reversedNumber[splitNumber.length - 1 - i] = splitNumber[i];
        }

        return Arrays.equals(reversedNumber, splitNumber);
    }

    public static boolean isPerfectNumber(int number){

        if (number < 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number){

        if (number < 0) {
            return "Invalid Value";
        }

        String[] splitNumber = String.valueOf(number).split("");

        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        String numWords = "";

        for (int i = 0; i < splitNumber.length; i++){
            numWords = numWords + words[Integer.parseInt(splitNumber[i])] + " ";
        }
        return numWords.trim();
    }

}
