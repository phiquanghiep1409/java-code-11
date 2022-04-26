package vn.techmaster;


import java.util.Random;
import java.util.Scanner;

public class Method {
    private static Random rd;
    private static int i;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Bài 1
        for (int i = 0; i < 10; i++) {
            System.out.print("a");

        }
//        Bài 2
        for (int i = 0; i < 10; i++) {
            System.out.print("a-");

        }
//        Bài 3
        for (int i = 0; i < 5; i++) {
            System.out.println("a-");

        }
//        Bài 4
        System.out.println("Các số chia hết cho 5 là: ");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }


//        Bài 6
        System.out.println("Fizz");
        for (int i = 1; i <= 100; i++); {
            if (i % 3 == 0) {
            }
            System.out.println(i);
        }

        System.out.println("Buzz");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println("FizzBuzz");
        for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                }
                i++;
            }

    }


}
//    Bài 5
 class BanKinhTheTichHC {

    public static double BanKinh(double r) {
            return r;
    }
    public static double TheTich(double r) {
        return r * r * r * 3.14;
    }
    public static void main(String[] args) {
        final double PI;
        PI = 3.14;

        double r;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập bán kính hình cầu : ");
        r = scanner.nextDouble();
        System.out.println("Thể tích hình cầu là : " + TheTich(r));

    }
 }

