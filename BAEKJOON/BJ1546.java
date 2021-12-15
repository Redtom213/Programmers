package BAEKJOON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BJ1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        ArrayList<Float> list = new ArrayList<Float>();
        float sum = 0;

        for (int i = 0; i < N; i++) {
            list.add((float) sc.nextInt());
        }

        float max = Collections.max(list);

        for (int i = 0; i < N; i++) {
            list.set(i, list.get(i) / max * 100);
            sum += list.get(i);
        }

        System.out.println(sum / N);
    }
}
