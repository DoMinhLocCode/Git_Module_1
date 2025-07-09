package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // Bạn hãy viết chương trình hiển thị ra màn hình các số có số 0 ở cuối từ 1 tới 1000 (màn hình sẽ hiển thị lên các số 10, 20, 30, ..., 990, 1000)
            // VÒNG LẶP for
        System.out.println("Kết quả");
//        for (int i = 0; i <= 1000; i++) {
//            if (i % 10 == 0){
//                System.out.print(i + "");
//                System.out.println(); // Dùng để cách dòng nè
//            }
//        }

            // Vòng lặp while
//        int i = 1;
//            while (i <= 1000) {
//                if (i % 10 == 0){
//                    System.out.println(i + "");
//                }
//                i++;
//            }

            // Vòng lặp do while
            int i = 1;
                do {
                    if ( i % 10 == 0){
                        System.out.println(i + "");
                    }
                        i ++;
                }   while (i <= 1000);
    }
}