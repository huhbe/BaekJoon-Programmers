class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1=Integer.toString(a);
        String b1=Integer.toString(b);
        String a1b1=a1+b1;
        String b1a1=b1+a1;
        int a2b2=Integer.parseInt(a1b1);
        int b2a2=Integer.parseInt(b1a1);
        
        if(a2b2>b2a2){
            answer=a2b2;
        }else if(a2b2<b2a2){
            answer=b2a2;
        }else{
            answer=a2b2;
        }
        return answer;
    }
}