package BAEKJOON.FOR;

import java.util.Scanner;

public class star6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String space = "";
            String star = "";
            int starCnt = 0;
            if (i < N / 2 + 1) {
                starCnt = 2 * i - 1;
            } else {
                starCnt = (N - i) * 2 + 1;
            }
            space = new String(new char[(N - starCnt) / 2]).replace("\0", " ");
            star = new String(new char[starCnt]).replace("\0", "*");
            System.out.println(space + star + space);
        }
    }
}
