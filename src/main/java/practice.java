import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        int[] answer = {1, 2, 3, 4, 5};
        Arrays.sort(answer);
        int num = answer.length / 2;
        System.out.println(answer[num]);

    }
}
