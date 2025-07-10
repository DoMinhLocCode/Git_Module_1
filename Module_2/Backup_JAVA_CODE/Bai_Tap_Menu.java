import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Bai_Tap_Menu {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int choice;
        
        do {
            System.out.println();
        System.out.println("-------------------------------------------|");
        System.out.println("Chào mừng Thầy đến với bình nguyên vô tận. |");
        System.out.println("-------------------------------------------|");
        System.out.println("Đây là Menu, Thầy có thể tương tác.        |");
        System.out.println("-------------------------------------------|");
        System.out.println("1. 🥰 Hiển thị 1 lời chào thân thương 🥰    |");
        System.out.println("2. ➕️ Tính tổng 2 số Thầy tự chọn ➕️        |");
        System.out.println("3. 🔚 Kết thúc chương trình 🔚              |");
        System.out.println("-------------------------------------------|");
        System.out.println("Mời Thầy chọn nhé");
        System.out.println();

            choice = scanner.nextInt();

        switch (choice) {
            case 1: 
                System.out.println("Hello thầy Linh 🙋");
                break;

            case 2:
                System.out.println("Nhập số Thầy muốn thứ 1: ");
                int userInput1 = scanner.nextInt();
                System.out.println();
                System.out.println("Nhập số Thầy muốn thứ 2: ");
                int userInput2 = scanner.nextInt();
                System.out.println();
                int userValue = userInput1 + userInput2;
                System.out.println("|------------------------------|");
                System.out.println("  Tổng 2 số Thầy đã chọn là: " + userValue);
                System.out.println("|------------------------------|");
                break;

            case 3: 
                System.out.println("Chương trình truyền hình đến đây là kết thúc: ");
                System.out.println(" Bai Bai Thầy 👋.");
                System.out.println();
                break;

            default:
                System.out.println(" ⚠️ Lựa chọn không hợp lệ ⚠️");
        }

        } while (choice != 3);
            scanner.close();
    }
}

