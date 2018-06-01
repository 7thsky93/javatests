package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = 100, max = 0;

        System.out.println("Введите количество элементов массива");
        int n = in.nextInt();
        int[] mas = new int[n];

        for (int i = 0; i < n; i++) {
            mas[i] = 10 + (int) (Math.random() * (90));
            if (mas[i] > max) max = mas[i];
            if (mas[i] < min) min = mas[i];
            System.out.print(mas[i] + " ");
        }

        System.out.println();
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }
}
