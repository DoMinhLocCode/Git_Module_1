import java.util.Arrays;
import java.util.Scanner;

public class Bai_Tap_Nang_Cao_Array {
    public static void main(String[] args) {
        int length = 5;
        int size = 0;
        int[] linhArr = new int[length];

                Scanner scanner = new Scanner(System.in);

            System.out.println("Mảng ban đầu được khởi tạo với 5 phần tử: ");
            System.out.println(Arrays.toString(linhArr));
            System.out.println();

            System.out.println("Thầy muốn add phần tử thứ 1 vào mảng là bao nhiêu?");
                int newValue = scanner.nextInt();
                size = addElement(linhArr, size, newValue);
            System.out.println();
        
            System.out.println("Thầy muốn add phần tử thứ 2 vào mảng là bao nhiêu?");
                int newValue02 = scanner.nextInt();
                size = addElement(linhArr, size, newValue02);
            System.out.println();

            System.out.println("Thầy muốn add phần tử thứ 3 vào mảng là bao nhiêu?");
                int newValue03 = scanner.nextInt();
                size = addElement(linhArr, size, newValue03);
            System.out.println();

            System.out.println("Thầy muốn add phần tử thứ 4 vào mảng là bao nhiêu?");
                int newValue04 = scanner.nextInt();
                size = addElement(linhArr, size, newValue04);
            System.out.println();       

            System.out.println("Thầy muốn add phần tử thứ 5 vào mảng là bao nhiêu?");
                int newValue05 = scanner.nextInt();
                size = addElement(linhArr, size, newValue05);
            System.out.println();
                scanner.nextLine();

            System.out.println("- Mảng sau khi thầy đã nhập là: ");
            System.out.println(Arrays.toString(linhArr));
            System.out.println();

            System.out.println("Thầy có muốn xoá phần tử cuối mảng không?");
            System.out.println("- Muốn xoá: vui lòng gõ Yes");
            System.out.println("- Không xoá: vui lòng gõ No");
            System.out.println("- Mời thầy nhập câu trả lời");
            System.out.println();
            String linhInput = scanner.nextLine();
                if (linhInput.equalsIgnoreCase("Yes")) {
                size = removeElement(linhArr, size, 10);
            System.out.println(Arrays.toString(linhArr));
            System.out.println();
            System.out.println("Tới khúc này là em tắt phép rồi thầy 🤣🤣🤣🤣");
                } else {
            System.out.println();
            System.out.println("Chương trình đã kết thúc");
            System.out.println("CẢM ƠN THẦY 💯💯💯.");
                }
    }

    public static int addElement(int[] linhArr, int size, int newElement){
            linhArr[size] = newElement;
            size ++;
            return size;
    }

    public static int removeElement(int[] linhArr, int size, int newremoveElement){
        if (size == 0) {
            System.out.println("Mảng đang rỗng, không thể xoá.");
            return size;
        }
            int removeValue = linhArr[size - 1];
            linhArr[size - 1] = 0;
        System.out.println("- Phần tử đã xoá cuối mảng là: " + removeValue);             
        System.out.println("- Mảng sau khi xoá phần tử cuối");
            return size -1; 
    }  

    public static String yesOrNo(Scanner scanner) {
        return scanner.nextLine();
    }
}
