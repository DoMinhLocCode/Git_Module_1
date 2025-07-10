import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Code_Love {
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String choice;
        System.out.println();

    do{
        System.out.println("Đây là Menu tình yêu");
        System.out.println();
        System.out.println("1. Nếu yêu anh hãy gõ 1:");
        System.out.println();
        System.out.println("2. Nếu không yêu anh hãy gõ 2:");
        System.out.println();
        System.out.println("Câu trả lời của em là?");

            choice = scanner.nextLine();

        switch (choice){
            case "1":
            System.out.println("Em đã chọn đúng rồi ❤️");
            System.out.println();
            System.out.println("  ***     ***  ");
            System.out.println(" *****   ***** ");
            System.out.println("******* *******");
            System.out.println(" ************* ");
            System.out.println("  ***********  ");
            System.out.println("   *********   ");
            System.out.println("    *******    ");
            System.out.println("     *****     ");
            System.out.println("      ***      ");
            System.out.println("       *       ");
            System.out.println();
            System.out.println();
            break;

            case "2":
            System.out.println("Sai rồi câu trả lời luôn luôn là: ");
            System.out.println();
            System.out.println("  ***     ***  ");
            System.out.println(" *****   ***** ");
            System.out.println("******* *******");
            System.out.println(" ************* ");
            System.out.println("  ***********  ");
            System.out.println("   *********   ");
            System.out.println("    *******    ");
            System.out.println("     *****     ");
            System.out.println("      ***      ");
            System.out.println("       *       ");
            System.out.println();
            break;

            default:
            System.out.println(" Không có câu trả lời này đâu nha");
        }

    }while (!choice.equals("2"));
        scanner.close();
}
}
