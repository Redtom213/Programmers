package BAEKJOON.IF;

import java.time.LocalTime;
import java.util.Scanner;

public class Baekjoon2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        LocalTime time = LocalTime.of(H, M);

        time = time.minusMinutes(45);

        System.out.println(time.getHour() + " " + time.getMinute());

        // int alarmH = 0;
        // int alarmM = 0;

        // int totalMinute = (60 * H) + (M - 45);

        // if (totalMinute < 0) {
        // alarmH = 23;
        // alarmM = 60 + totalMinute;
        // } else {
        // alarmH = totalMinute / 60;
        // alarmM = totalMinute % 60;
        // }

        // System.out.println(alarmH + " " + alarmM);
    }
}
