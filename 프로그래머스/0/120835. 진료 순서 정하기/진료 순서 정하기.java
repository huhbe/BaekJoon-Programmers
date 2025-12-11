import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emergency_sort=emergency.clone();
        int[] emergency_sort_reverse=new int[emergency.length];
        int idx=0;
        Arrays.sort(emergency_sort);
        for(int i=emergency.length-1; i>=0; i--){
            emergency_sort_reverse[idx++]=emergency_sort[i];
        }
        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<emergency.length; j++){
                if(emergency[i]==emergency_sort_reverse[j]) answer[i]=j+1;
            }
        }
        return answer;
    }
}