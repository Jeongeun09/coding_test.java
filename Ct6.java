package Coding_test;

import java.util.Scanner;

public class Ct6 {
    // 6. 소수 판별하기
    //사용자로부터 정수 N을 입력받아 소수(prime number) 인지 판별하는 프로그램을 작성하세요.
    public class Check {
        public static boolean Prime_num(int number) {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력해주세요 : ");
        int N = scanner.nextInt();

        if (Check.Prime_num(N)) {
            System.out.println(N + "는 소수입니다.");
        } else {
            System.out.println(N + "는 소수가 아닙니다.");
        }
    }

}
