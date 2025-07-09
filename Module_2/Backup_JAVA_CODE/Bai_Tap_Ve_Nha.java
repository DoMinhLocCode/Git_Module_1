import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Arrays;

public class Bai_Tap_Ve_Nha {
    public static void main(String[] args) {
        int length = 10;
        int size = 0;
        int[] myArr = new int[length];
            System.out.println("- Phần tử ban đầu được khởi tạo: ");
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                // Thêm phần tử vào mảng
                size = addElement(myArr, size, 20);
            System.out.println(Arrays.toString(myArr)); 
            System.out.println();
            
                size = addElement(myArr, size, 15);
            System.out.println(Arrays.toString(myArr));
            System.out.println();
            
                size = addElement(myArr, size, 30);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                size = addElement(myArr, size, 22);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                size = addElement(myArr, size, 27);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

            size = addElement(myArr, size, 01);
            System.out.println(Arrays.toString(myArr));
            System.out.println();
            
                size = addElement(myArr, size, 07);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                size = addElement(myArr, size, 99);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                size = addElement(myArr, size, 100);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                size = addElement(myArr, size, 500);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                // Xoá phần tử cuối mảng
                size = removeElement(myArr, size, size);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                size = removeElement(myArr, size, size);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                size = removeElement(myArr, size, size);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                size = removeElement(myArr, size, size);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                // Sửa/ Thay thế phần tử ở cuối mảng
                size = replaceElement(myArr, size, 8686);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                size = replaceElement(myArr, size, 9999);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                // Chèn thêm 1 phần tử mới vào mảng
                size = insertElement(myArr, size, 69);
            System.out.println(Arrays.toString(myArr));
            System.out.println();

                size = insertElement(myArr, size, 77);
            System.out.println(Arrays.toString(myArr));
            System.out.println();
    }
            // Phương thức thêm phần tử vào cuối mảng
    public static int addElement(int[] myArr, int size, int newElement){
        myArr[size] = newElement;
            size ++;
            System.out.println("- Phần tử sau khi thêm vào mảng là: " + newElement);
            System.out.println("- Mảng sau khi được thêm phần tử mới: ");
                return size;

    } 
            // Phương thức xoá phần tử ở cuối mảng
    public static int removeElement(int[] myArr, int size, int newremoveElement){
        if (size == 0) {
            System.out.println("Mảng đang rỗng, không thể xoá.");
            return size;
        }
            int removeValue = myArr[size - 1];
            myArr[size - 1] = 0;
        System.out.println("- Phần tử đã xoá cuối mảng là: " + removeValue);             
        System.out.println("- Mảng sau khi xoá phần tử cuối");
            return size -1; 
    }  
            // Phương thức sửa/ Thay thế phần tử ở cuối mảng
    public static int replaceElement(int[] myArr, int size, int newreplaceElement){
        if (size == 0) {
            System.out.println("Không có phần tử nào trong mảng để thay thế");
            return size;     
        }
            int replaceValue = myArr[size - 1];
            myArr[size - 1] = newreplaceElement;
        System.out.println("- Phần tử đã được thay thế ở cuối mảng là: " + newreplaceElement);
        System.out.println("- Mảng sau khi được thay thể ở cuối mảng là: ");
        return size;
    }
            // Phương thức chèn một phần tử mới vào mảng
    public static int insertElement(int[] myArr, int size, int newinsertElement){
        if (size >= myArr.length){
            System.out.println("Mảng đã đạt số lượng nhất định, không thể thêm! ");
        }
            myArr[size] = newinsertElement;
            System.out.println("- Phần tử sau khi được chèn thêm vào mảng là: " + newinsertElement);
            System.out.println("- Mảng sau khi được chèn thêm phần tử mới:");
            size ++;
        return size;
    }
}
