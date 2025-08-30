package Coding_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static javax.management.Query.or;

public class Ct7 {
    // 7. 단어 빈도 세기
    //문자열을 입력받아 공백 기준으로 단어를 나누고, 각 단어가 몇 번 나왔는지 세어 출력하세요.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 입력하세요 : ");
        String ch = scanner.nextLine();

        String[] words = ch.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase(); // 대소문자 구분 안 하려면 소문자로 변환
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("\n단어 빈도:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue() + "번");
        }

        scanner.close();
    }
}
