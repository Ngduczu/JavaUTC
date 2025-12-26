# Cú pháp cơ bản của ngôn ngữ lập trình Java

**Mục lục**:
- [`Cú pháp nhập xuất`](#cú-pháp-nhập-xuất)
    - [`Nhập dữ liệu`](#nhập-dữ-liệu)
    - [`Xuất dữ liệu`](#xuất-dữ-liệu)
- [`Primitive Datatype`](#kiểu-dữ-liệu-nguyên-thủy)
- [`Biến và hằng số`](#variable--constant)
- [`Cấu trúc rẽ nhánh`](#cấu-trúc-rẽ-nhánh)
    - [`if - else`](#if---else)
    - [`switch - case`](#switch---case)
- [`Vòng lặp`](#vòng-lặp)
    - [`Vòng lặp for`](#for-loop)
    - [`Vòng lặp while - do while`](#while---do-while-loop)
- [`Mảng`](#mảng)
    - [`Mảng 1 chiều`](#)
    - [`Mảng 2 chiều`](#)


## Cú pháp nhập xuất

### Nhập dữ liệu:
Java cung cấp 3 phương thức chính để in dữ liệu ra màn hình Console thông qua `System.out`
```java
    System.out.println() : in nội dung và xuống dòng
    System.out.print()   : in nội dung và KHÔNG xuống dòng
    System.out.printf()  : in theo định dạng (tương tự printf trong C)
```
### Xuất dữ liệu:
- Ngôn ngữ lập trình `Java` không có phương thức để nhập mặc định.
- Để nhập dữ liệu từ bàn phím, chúng ta thường sử dụng lớp `Scanner` từ package `java.util.` - và nó sẽ đọc dữ liệu từ `System.in`
### Đọc thêm: - Nguyên nhân phải dùng Scanner - 
>Bản chất `System.in` chỉ đọc dữ liệu ở dạng byte thô. `Scanner` là một lớp bao bọc (wrapper) giúp chuyển đổi các byte đó thành các kiểu dữ liệu mong muốn như int, double, String một cách dễ dàng.Nó hỗ trợ các phương thức như `nextInt()`, `nextLine()`, `nextDouble()` giúp lập trình viên không cần phải ép kiểu thủ công từ chuỗi sang số.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        String s = sc.nextLine();
        sc.close();
    }
}
```

## Kiểu dữ liệu nguyên thủy
|Kiểu	|Dung lượng|	Ví dụ|
|-------|----------|---------|
|int    |	4 byte |	int a = 10;|
|long   |	8 byte |	long b = 100L;|
|float  |	4 byte |	float c = 1.5f;|
|double |	8 byte |	double d = 2.5;|
|char   |	2 byte |	char x = 'A';|
|boolean|	1 bit  |	boolean ok = true;|

📌 Primitive:
- Lưu giá trị trực tiếp
- Không có method
---
## Variable & Constant

- **Biến** : Có thể thay đổi giá trị trong quá trình chạy.
```java
    <datatype> <variable_name> = <value>;
```
- **Hằng** : Không thể thay đổi giá trị sau khi gán.
```java
    final <datatype> <constant_name> = <value>;
```
---
## Cấu trúc rẽ nhánh

### `If - else`
```java
if (condition) {
    // Thực hiện nếu đúng
} else if (otherCondition) {
    // Thực hiện nếu điều kiện 2 đúng
} else {
    // Thực hiện nếu tất cả sai
}
```

### `Switch - case`

```java
switch (variable) {
    case value1:
        // code
        break;
    case value2:
        // code
        break;
    default:
        // code nếu không khớp case nào
}
```
## Vòng lặp
### `For loop`
 *Dùng khi biết trước số lần lặp.*

```java
for( khởi tạo ; điều kiện ; cập nhật){
    // khối lệnh code
}
```
### `While - Do while loop`
 *While loop dùng khi muốn code lặp đi lặp lại trong khi điều kiện vẫn còn đúng*
```java
while( điều kiện ){
    // khối lệnh code
}
```

<br>

*do...while được dùng khi muốn lặp đi lặp lại khối code khi điều kiện đúng mà vẫn chạy ít nhất là 1 lần.*
```java
do{
    // khối lệnh code
} while ( điều kiện );
```

## Mảng
**|** *Mảng trong Java là tập hợp các phần tử cùng kiểu dữ liệu và có kích thước cố định.*
### **Mảng 1 chiều:**
```java
// Khai báo và cấp phát bộ nhớ
int[] arr = new int[5]; 

// Khởi tạo trực tiếp giá trị
int[] numbers = {1, 2, 3, 4, 5};

// Truy cập và lấy độ dài
int len = numbers.length; // 5
int first = numbers[0];   // 1
```
### **Mảng 2 chiều:**
*Bản chất là mảng chứa các mảng khác.*
```java
// Khai báo mảng 2 hàng, 3 cột
int[][] matrix = new int[2][3];

// Khởi tạo trực tiếp
int[][] table = {
    {1, 2, 3},
    {4, 5, 6}
};

// Duyệt mảng 2 chiều
for (int i = 0; i < table.length; i++) {         // Duyệt hàng
    for (int j = 0; j < table[i].length; j++) {  // Duyệt cột
        System.out.print(table[i][j] + " ");
    }
    System.out.println();
}
```
> <br>***💀 còn dài nữa nhưng mà phần kiến thức toán tử sẽ giống C/C++ nên sẽ không nhắc lại*** <br><br>