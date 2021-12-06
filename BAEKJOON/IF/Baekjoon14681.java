package BAEKJOON.IF;

import java.util.Scanner;

class Baekjoon14681 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int solution = 0;

        if (x > 0) {
            solution += 1;
        } else {
            solution += 2;
        }

        if (y > 0) {
            solution += 0;
        } else {
            solution += 1;
        }

        if (x > 0 && y < 0)
            solution *= 2;

        System.out.println(solution);
    }

}