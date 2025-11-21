import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        List<Integer> num=new ArrayList<>();
        
        for(int i=5; i<num_list.length; i++){
            num.add(num_list[i]);
        }
        
        int[] answer = new int[num.size()];
        for(int i=0; i<num.size(); i++){
            answer[i]=num.get(i);
        }
        return answer;
    }
}