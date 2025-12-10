import java.util.*;
class Solution {
    public int[] solution(int[] array) {
        int[] newArray = array.clone();
        Arrays.sort(array);
        int[] answer=new int[2];
        
        for(int i=0; i<array.length; i++){
            if(array[array.length-1]==newArray[i]){
                answer[0]=array[array.length-1];
                answer[1]=i;
            }
        }
        return answer;
    }
}