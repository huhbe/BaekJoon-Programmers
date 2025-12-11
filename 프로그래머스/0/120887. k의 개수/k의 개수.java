class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int a=i; a<=j; a++){
            String str=String.valueOf(a);
            for(char c : str.toCharArray()){
                if(c==(char)('0'+k)) answer++;
            }
        }
        return answer;
    }
}