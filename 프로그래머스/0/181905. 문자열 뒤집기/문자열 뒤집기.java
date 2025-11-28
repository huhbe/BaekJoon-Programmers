class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String front=my_string.substring(0,s);
        String mid=my_string.substring(s, e+1);
        String rear=my_string.substring(e+1);
        answer=front+(new StringBuffer(mid).reverse().toString())+rear;
        return answer;
    }
}