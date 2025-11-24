class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = strArr;
        
        for(int i=0; i<strArr.length; i++){
            strArr[i]=i%2!=0 ? strArr[i].toUpperCase() : strArr[i].toLowerCase();
        }
        return answer;
    }
}