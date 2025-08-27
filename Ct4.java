package Coding_test;

import java.util.Scanner;

public class Ct4 {
    // 문제 4 — 문자열 뒤집기
    // 사용자로부터 문자열을 입력받아, 거꾸로 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        char[] chars = input.toCharArray(); // 문자열을 문자 배열로 변환
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        String reversed = new String(chars);
        System.out.println("뒤집힌 문자열: " + reversed);

    }
}
