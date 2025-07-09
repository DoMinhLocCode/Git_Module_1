/* Arry (Mảng): là một biến đặc biệt, chứa các dữ liệu liên quan đến nhau

 Cách khai báo:
     let <tên mảng> = [<phan_tu1>, </Phan_tu2, ...>];

 let scores = new Array(4, 5, 10, 0); // cách khai báo ít sử dụng

 - Chỉ số mảng (index): là vị trí của các giá trị trong mảng, bắt đầu từ 0
 - Phần tử: là các giá trị trong mảng

 Cách truy xuất phần tử trong mảng: <ten_mang>[<index>]

 Độ dài mảng (length): Số lượng phần tử có trong mảng 

 Trong javascript thì các phần tử không cần cùng kiểu dử liệu

Ví dụ:
let number  = [1, 2, 3, 4, 5.6]; // Tập số nguyên
// Name => C04
let nameclassC04 = ["Linh", "Lộc", "Milo","Huy"]; // Tập các tên liên quan đến nhau
// Chỉ số mảng:        0      1      2      3     
// Vị trí cuối: lenght - 1
// Phần tử:         "Linh"  "Lộc"  "Milo" "Huy"
// Độ dài: 4
// Cách truy xuất phần tử trong mảng:
console.log(nameclassC04[0]); // in ra "Linh"
console.log(nameclassC04[1]); // in ra "Lộc"
console.log(nameclassC04.length); // Lấy ra độ dài của mảng

Cách gán lại giá trị:
nameclassC04[0] = TDVL;


*/


// Sử dụng for để duyệt mảng
// let nameclassC04 = ["Linh", "Lộc", "Milo","Huy"];
// for(let i = 0; i < nameclassC04.length; i++) {
//     console.log(nameclassC04[i]);
// }


// Tìm các hàm tương tác với mảng: CRUD (Create, Read, Update, Delete) các phần tử trong mảng.
// push(): Thêm phần tử vào cuối mảng
// pop(): Xóa phần tử cuối mảng
// concat(): Nối các mảng với nhau
// join(): Tạo ra chuỗi chứa các phần tử từ mảng
// splice(): Có thể thêm, xóa hoặc có thể sửa

let names = ["Milo", "Hae", "Joan", "Ber"];
// names.splice(1, 1); // (<vị trí bắt đầu>, <số lượng phần tử muốn xóa>) // xóa phần tử
// names.splice(1, 0, "Lô"); // Chèn phần tử
names.splice(2, 1, "Lô"); // Sửa
console.log(names);


// let names = ["Milo", "Hae", "Joan", "Ber"];
// console.log(names);
// let str = names.join("-");
// console.log("str:" + str);

// names.push("Cao"); // unshift(): thêm phần tử vào đầu mảng
// names.pop(); // shift(): xóa phần tử đầu mảng
// let names_2 = ["Dân chơi", "Bro", "Girl"];
// let names_3 = names.concat(names_2);

// console.log(names_3);




