package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Введите длину последовательности от 0 до 2147483647");
            int n = in.nextInt();

            if (n < 0) {
                System.out.println("Введено значение меньше 0");
                System.exit(0);
            }

            int mas[] = new int[n];
            int num = 0, sum = 0;

            for (int i = 0; i < n; i++) {
                mas[i] = num++;
            }

            for (int i = 0; i < n; i++) {
                if (mas[i] % 2 == 0) {
                    System.out.print(mas[i] + " ");
                    sum = sum + mas[i];
                }
            }

            System.out.println();
            System.out.println("Сумма четных элементов последовательности: " + sum);
        }
        catch (InputMismatchException ime) {
            System.out.println("Ошибка. Введено значение превышающее максимальное.");
            System.exit(0);
        }
    }
}
