import java.util.*;
class Solution {
    public int solution(String before, String after) {
        char[] c1=before.toCharArray();
        char[] c2=after.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String bf=new String(c1);
        String af=new String(c2);
        int answer=bf.equals(af) ? 1:0;
        return answer;
    }
}