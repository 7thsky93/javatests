package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину стороны A");
        int a = in.nextInt();
	    System.out.println("Введите длину стороны B");
        int b = in.nextInt();
        System.out.println("Введите длину стороны C");
        int c = in.nextInt();

        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            System.out.println("Такой прямоугольный треугольник может существовать");
        }
        else {
            System.out.println("Такой прямоугольный треугольник НЕ может существовать");
        }
    }
}
