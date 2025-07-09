/* 
Hàm (function): là 1 khối các câu lệnh thực hiện 1 tác vụ hoặc 1 tính năng nào đó.
Hàm (function), Phương thức (Method)
*/

// Khai báo hàm;
/*   function <ten_ham> () {
        <khoi_lenh_thuc_thi>;
}
    Note: Tên hàm thì được viết theo kiểu camelCase và là động từ.

*/
// Cách sử dụng hàm
// <ten_ham> ();
      //  VD:
//  function goProgram() {
//         alert('Hello');
//     }
// goProgram();



// // Tham số truyền vào: các biến trong dấu ngoặc tròn ()
// // Không giới hạn số lượng tham số truyền vào hàm.
// function showInfo(name, age) { // name: được gọi là tham số truyền vào.
//     alert ("Hello" + "-" + name + "có tuổi" + age); // sử dụng tham số truyền vào.
// }
// // "Linh", "Milo" (gọi là ĐỐI SỐ) là giá trị mà hàm sẽ sử dụng để thay thế cho tham số truyền vào là đối số truyền vào hàm.
// // Số lượng đối số thì sẽ cần = số lượng tham số truyền vào
//       showInfo("Linh", 18); // name = "Linh", age = 18
//       showInfo("Milo", 25); // name = "Milo" age = 25



// // return (trả về);
// function getAvg(a,b) {
//     let avg = (a + b)/ 2;
//    // console.log(avg); // Hiển thị
//     return(avg); // Trả ra Avg
// }
//     let a1 = 5;
//     let b1 = 11;
// let c = getAvg(a1,b1); // tính trung bình cộng của a và b sau đó gán giá trị đó cho biến c.
//     console.log("C" + c); 


// Tạo hàm show() để hiển thị "Hello
// function show() {
//     alert("Hello World");
// }
//     show();

 // Tạo hàm tinhTong(a, b) tính tổng 2 số và hiển thị ra màn hình.
//  function showTotal(a,b) {
//     let showTotal = (a + b);
//     alert("Tổng của a và b là " + showTotal);
//  }
//  let a1 = 10;
//  let b1 = 20;
//    let total = showTotal(a1,b1);

// Tạo hàm tinhTong(a, b) tính tổng 2 số và return về tổng đó.
// function showTotal(a,b) {
//     let showTotal = (a + b);
//     alert("Tổng của a và b là " + showTotal);
//     return (total);
//  }
//  let a1 = 10;
//  let b1 = 20;
//    let total = showTotal(a1,b1);


  // Chuyển đổi giữa feet và meters
    
//   function footToMeter(foot) {
//     let meter = 0.305 * foot;
//     return meter;
// }

// function meterToFoot(meter) {
//     let foot = 3.279 * meter;
//     return foot;
// }

// let foot = +prompt("Nhập foot: ");
// document.write(foot + " foot " + "= " + footToMeter(foot) + " meter");
// document.write ("<br>")
// let meter = +prompt("Nhập meter: ");
// document.write(meter + " meter " + "= " + meterToFoot(meter) + " foot");

 let a = "Hi";
 if (true) {
    let a = "Hello";
    console.log(a);
 }
 console.log(a);

 
 