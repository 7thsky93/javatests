package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        String num1 = in.next();

        try {
            int num = Integer.parseInt(num1);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Введено не целое число!");
            System.exit(0);
        }

        int n = Integer.parseInt(num1);

        System.out.println("Введите второе целое число: ");
        String num2 = in.next();

        try {
            int num = Integer.parseInt(num2);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Введено не целое число!");
            System.exit(0);
        }
        int m = Integer.parseInt(num2);

        System.out.println("Сумма чисел: " + sum(n, m));
        System.out.println("Разность чисел: " + diff(n, m));
        System.out.println("НОД: " + gcd(n, m));
        System.out.println("НОК: " + lcm(n, m));

    }

    public static int sum(int n, int m) {
        return n + m;
    }

    public static int diff(int n, int m) {
        return n - m;
    }

    public static int gcd(int n,int m){ //НОД
        return m == 0 ? n : gcd(m,n % m);
    }

    public static int lcm(int n,int m){ //НОК
        return n / gcd(n,m) * m;
    }
}
