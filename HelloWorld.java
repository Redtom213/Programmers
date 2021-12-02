import java.util.Arrays;
import java.util.Collections;

public class HelloWorld {
    public static void main(String[] args) {

        String[] manList = { "권민석", "김미래", "김훈", "임주혁" };
        String post_day[] = { "8일", "15일", "22일", "29일" };

        Collections.shuffle(Arrays.asList(manList));

        int index = 0;
        for (String string : post_day) {
            System.out.println("1월 " + string + " 당직은 " + manList[index] + "입니다.");
            index++;
        }
    }
}
