package Coding_test;

import java.util.Scanner;

public class ct3 {
    // 문제 3 — 1~N 합계
    // 사용자로부터 양의 정수 N을 입력받아, 1부터 N까지의 합을 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력해주세요 : ");
        int number = scanner.nextInt();

        int sum = number * (number + 1) / 2;
        System.out.println(sum);
    }
}
