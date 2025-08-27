package Coding_test;

import java.util.Scanner;

public class Ct5 {
    // 문제 5 — 구구단 출력
    // 사용자로부터 1~9 사이의 정수를 입력받아,
    // 해당 숫자의 구구단을 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1~9 사이의 정수를 입력해주세요 : ");
        int num = scanner.nextInt();

        for (int i = 1; i < 2; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(num + "X" + j + "=" + num * j);
            }
        }

    }
}
