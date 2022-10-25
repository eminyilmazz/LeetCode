package Solutions.ReverseWords;

public class Solution {
    public String reverseWords(final String original) {
        StringBuilder sb = new StringBuilder();
        int firstSpace = 0;
        int secondSpace = original.indexOf(" ", firstSpace + 1);

        while (firstSpace >= 0) {
            if (secondSpace == -1) {
                sb.append(reverse(original.substring(firstSpace)));
                break;
            }
            sb.append(reverse(original.substring(firstSpace, secondSpace)));
            sb.append(" ");
            firstSpace = secondSpace + 1;
            secondSpace = original.indexOf(" ", firstSpace);
        }
        return sb.toString();
    }

    public String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
