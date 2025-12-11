class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int index=0;
        while(k>1){
            k--;
            index+=2;
        }
        index%=numbers.length;
        answer=numbers[index];
        return answer;
    }
}