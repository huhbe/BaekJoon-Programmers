class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String num=my_string.replaceAll("[a-zA-Z]","");
        for(int i=0; i<num.length(); i++){
            answer+=Integer.parseInt(num.substring(i,i+1));
        }
        return answer;
    }
}