package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    System.out.println("Введите через пробел или запятую слова");
	    String input = in.nextLine();
        String str = input.trim();

	    int count = 0;
        if(str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' || str.charAt(i) == ',') {
                    count++;
                }
            }
        }
        System.out.println("В предложении "+count+" слов");

        
    }
}
