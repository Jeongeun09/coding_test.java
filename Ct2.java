package Coding_test;

import java.util.Scanner;

public class Ct2 {
   // 문제 2 — 최소값 찾기
   // 사용자로부터 3개의 정수를 입력받아 가장 작은 수를 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("첫 번째 정수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 정수를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("세 번째 정수를 입력하세요: ");
        int num3 = scanner.nextInt();

        int min = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }

        System.out.println("가장 작은 수는: " + min);

        scanner.close();
    }

}
