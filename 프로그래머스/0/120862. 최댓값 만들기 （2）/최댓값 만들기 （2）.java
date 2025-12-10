import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                list.add(numbers[i]*numbers[j]);
            }
        }
        Collections.sort(list);
        int answer=list.get(list.size()-1);
        return answer;
    }
}