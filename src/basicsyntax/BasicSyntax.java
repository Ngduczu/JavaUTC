package basicsyntax;

import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args) {
        // Nhập xuất cơ bản
        Scanner sc = new Scanner(System.in);

        //khai báo biến và kiểu dữ liệu
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        final double PI = 3.14159265;

        System.out.print("a = " + a + "\n");
        System.out.println("b = " + b);
        System.out.printf("s = %s", s);
        
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        } 
        // đóng scanner
        sc.close();

        //
    }
}
