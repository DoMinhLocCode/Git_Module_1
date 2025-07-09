package org.example;

import java.util.Scanner;

public class Hien_Thi_Cac_Loai_Hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int choice = -1;
                    while (choice != 0) {
                System.out.println("Menu");
                System.out.println("1. Print the rectangle");
                System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                System.out.println("3. Print isosceles triangle");
                System.out.println("4. Exit");

                    choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("1. Print the rectangle");
                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 7; j ++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;

                    case 2:
                        System.out.println("Square triangle - bottom-left:");
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }

                        System.out.println("Square triangle - top-left:");
                        for (int i = 5; i >= 1; i--) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }

                        System.out.println("Square triangle - bottom-right:");
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= 5 - i; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }

                        System.out.println("Square triangle - top-right:");
                        for (int i = 5; i >= 1; i--) {
                            for (int j = 1; j <= 5 - i; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 1; j <= i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;

                    case 3:
                        System.out.println("Isosceles triangle:");
                        int height = 5;
                        for (int i = 1; i <= height; i++) {
                            for (int j = 1; j <= height - i; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 1; j <= (2 * i - 1); j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                        break;

                    case 4:
                        System.out.println("Exiting program. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
                    }

        scanner.close();
    }
}