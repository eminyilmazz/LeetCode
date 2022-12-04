package Solutions.IsSubsequence;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public boolean isSubsequence(String s, String t) {
        Queue<Character> queue = new LinkedList<>();
        int i = 0;
        for (Character c : s.toCharArray()) {
            queue.add(c);
        }
        while(!queue.isEmpty() && i < t.length()) {
            if(t.charAt(i) == queue.peek()) queue.poll();
            i++;
        }
        return queue.isEmpty();
    }
}
