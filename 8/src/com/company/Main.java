package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину последовательности. Максимальное значение - 100");
        int n = in.nextInt();

        if (n == 100){
            System.out.println("Введенная длина последовательности превышает разрешенную.");
            System.exit(0);
        }

        n++;

        int num = 0;
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = num++;
        }

        for (int i = 0; i < n; i++) {
           System.out.print(mas[i] + " ");
        }

        System.out.println();
        if (n < 11) {
            System.out.println("В данной последовательности чисел нет палиндромных чисел.");
            System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            if (i > 10) {
                String word = Integer.toString(mas[i]);
                if (isPalindrom(word.toCharArray()) == true) {
                    System.out.println(word + " - число палиндром");
                }
            }
        }
    }

    public static boolean isPalindrom(char[] word) {
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
