package Solutions.ReverseWords;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution2 {
    public String reverseWords(final String original) {
        String[] array = original.split(" ");
        return Stream.of(array).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
    }
}

