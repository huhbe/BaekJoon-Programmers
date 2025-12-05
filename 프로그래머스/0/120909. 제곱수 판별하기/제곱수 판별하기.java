class Solution {
    public int solution(int n) {
        int sqrt=(int)Math.sqrt(n);
        int answer = (sqrt*sqrt)==n ? 1:2;
        return answer;
    }
}