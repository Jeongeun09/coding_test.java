package Coding_test;

import java.util.Scanner;

public class Ct11 {
    // 11. 아나그램 판별
    //두 문자열을 입력받아 아나그램(anagram) 인지 판별하는 프로그램을 작성하세요.
    //아나그램: 문자의 구성이 같으면 같은 단어로 보는 것.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("20자 내의 기준 문자를 입력해주세요 : ");
        String base = scanner.nextLine();
        boolean correct = false;


        while (!correct) {
            System.out.println("20자 내의 기존 문자에 맞는 문자를 입력해주세요 : ");
            String input = scanner.nextLine();


            if (base.equals(input)) {
                System.out.println("맞았다!!!");
                correct = true;
            } else {
                System.out.println("틀렸다ㅜㅜ");
            }
        }
        scanner.close();
    }
}
