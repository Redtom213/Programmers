package BAEKJOON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine()); // 테스트 케이스 갯수

        for (int i = 0; i < N; i++) {
            String board = sc.nextLine();
            int score = 0; // 답
            int point = 1; // 기본점수1

            for (int j = 0; j < board.length(); j++) {
                if ('O' == board.charAt(j)) {
                    score += point;
                    point += 1;
                } else {
                    point = 1;
                }
            }

            System.out.println(score);
        }

    }
}
