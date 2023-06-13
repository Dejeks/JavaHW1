package org.example.Homework.HW1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;

        while ((num = scanner.nextInt()) != 0) {
            if (num > 0 && scanner.nextInt() < 0) {
                sum += num;
            }
        }

        System.out.println("Сумма положительных чисел, перед которыми идет отрицательное число: " + sum);
    }
}
