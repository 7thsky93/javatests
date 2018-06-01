package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение");
        String input = in.nextLine();

        System.out.println("Введите искомое слово");
        String word = in.nextLine();

        String[] str = input.split(" ");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceAll(",", "");
            if (str[i].equalsIgnoreCase(word)) {
                count++;
            }
        }

        System.out.println("Слово " + word + " повторяется " + count + " раз.");
    }
}
