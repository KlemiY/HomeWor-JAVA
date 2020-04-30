package Homework;

/*
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */
// Добавил сканнер для ввода любой фразы.

import java.util.Scanner;

public class Task5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите любое слово или фразу: ");
            String phrase = scanner.nextLine();

            //convert String to character array
            // by using toCharArray
            char[] try1 = phrase.toCharArray();

            for (int i = try1.length - 1; i >= 0; i--)
                System.out.print(try1[i]);
        }
}

