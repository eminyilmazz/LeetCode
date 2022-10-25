package Solutions.WhoLikesIt;

public class Solution {
    public String whoLikesIt(String... names) {
        StringBuilder sb = new StringBuilder();

        if (names.length == 0) return "no one likes this";
        else if (names.length == 1) {
            sb.append(names[0]).append(" likes this");
        } else if (names.length < 4) {
            for (int i = 0; i < names.length - 1; i++) {
                sb.append(names[i]);
                if(i != names.length - 2) {
                    sb.append(", ");
                } else {
                    sb.append(" and ");
                }
            }
            sb.append(names[names.length - 1] + " like this");
        } else {
            sb.append(names[0]);
            sb.append(", ");
            sb.append(names[1]);
            sb.append(" and ");
            sb.append(names.length - 2);
            sb.append(" others like this");
        }
        return sb.toString();
    }
}
