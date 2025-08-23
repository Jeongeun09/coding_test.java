package Coding_test;

import java.util.Scanner;

public class Ct1 {
    // 문제 1 — 짝수/홀수 구분
    //사용자로부터 정수를 입력받아, 그 수가 짝수인지 홀수인지 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int EndNum = 20;
        for (int i = 1; i < EndNum; i++) {
            System.out.print("숫자를 입력해주세요: ");
            int number = scanner.nextInt();

            if (number % 2 == 1) {
                System.out.println("입력하신 수는 홀수입니다.");
            } else {
                System.out.println("입력하신 수는 짝수입니다");
            }
            System.out.println();
        }
    }

}
