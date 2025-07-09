package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Kiem_Tra_So_Nguyen_To {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào một số bất kỳ.");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " không phải là số nguyên tố");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i ++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number + " Là số nguyên tố");
            } else {
                System.out.println(number + " Không phải là số nguyên tố");
            }
        }
            scanner.close();
    }
}