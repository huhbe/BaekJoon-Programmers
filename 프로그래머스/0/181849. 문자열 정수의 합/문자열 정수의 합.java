class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        String[] num_int=num_str.split("");
        for(int i=0; i<num_int.length; i++){
            answer+=Integer.parseInt(num_int[i]);
        }
        return answer;
    }
}