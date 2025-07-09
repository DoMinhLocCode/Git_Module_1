package org.example;

import java.util.Scanner;

public class Uoc_So_Chung_Lon_Nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Hãy nhập số nguyên thứ 1.");
                int number01 = scanner.nextInt();

            System.out.println("Hãy nhập số nguyên thứ 2 ");
                int number02 = scanner.nextInt();

        if ( number01 == 0 && number02 == 0) {
            System.out.println("Không có ước số chung lớn nhất, vì cả 2 số đều bằng 0");
        } else if ( number01 == 0 || number02 == 0) {
            int ucln = Math.abs(number01 != 0 ? number01 : number02);
            System.out.println("Ước chung lớn nhất của 2 số đã nhập là: " + ucln);
        } else {
            int a = Math.abs(number01);
            int b = Math.abs(number02);

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
                System.out.println("Ước chung lớn nhất là: " + a);
        }
        scanner.close();
    }
}
