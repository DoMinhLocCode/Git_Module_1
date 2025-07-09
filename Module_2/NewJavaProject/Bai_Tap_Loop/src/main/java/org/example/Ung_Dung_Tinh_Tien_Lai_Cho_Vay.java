package org.example;

import java.util.Scanner;

public class Ung_Dung_Tinh_Tien_Lai_Cho_Vay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hãy nhập số tiền cho vay");
            double money = scanner.nextDouble();

        System.out.println("Hãy nhập số tháng cho vay");
            int month = scanner.nextInt();

        System.out.println(("Hãy nhập tỉ lệ lãi xuất theo tháng"));
            double interestrate = scanner.nextDouble();

            double totalinterestrate = 0;

        for (int i = 0; i <= month; i ++) {
            totalinterestrate += money * (interestrate/100)/12 * month;
        }
        scanner.close();
        System.out.println("Total of interestrate =" + totalinterestrate);

    }
}

