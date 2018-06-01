package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    for (;;) {
	        System.out.println("Наберите слово или 0 для выхода:");
            String str = in.next();
            String word = str.trim();

            if (word.equals("0")) {
                System.exit(0);
            }
            else {
                if (isPalindrom(word.toCharArray()) == true) {
                    System.out.println(word + " - слово палиндром");
                    System.out.println();
                }
                else {
                    System.out.println(word + " - не является палиндромом");
                    System.out.println();
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
