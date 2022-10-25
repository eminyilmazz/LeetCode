package Solutions.TakeATenMinutesWalk;

import java.util.HashMap;

public class Solution {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;
        HashMap<Character, Integer> directions = new HashMap<>();
        directions.put('n', 0);
        directions.put('e', 0);
        directions.put('s', 0);
        directions.put('w', 0);

        for (char c: walk) {
            directions.replace(c, directions.get(c) + 1);
        }
        return (directions.get('w') == directions.get('e') && directions.get('n') == directions.get('s'));
    }
}
