package loop;

import java.util.List;
import java.util.SplittableRandom;

public class Main1 {
    public static void main(String[] args) {
        // 문자열의 길이가 5 이상인 단어의 개수를 출력하시오.
        List<String> words = List.of("apple", "cat", "banana","dog", "grapes");
        int count = 0;
        for (String word : words) {
            if (word.length() > 4) {
                count++;
            }
        }
        System.out.println(count);

        words.stream().filter(word -> word.length() >= 5).forEach(n -> System.out.println(n));
    }
}
