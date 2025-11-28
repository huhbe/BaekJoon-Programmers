class Solution {
    public String solution(String my_string, int[] indices) {
        char[] c=my_string.toCharArray();
        for(int i=0; i<indices.length; i++){
            c[indices[i]]=' ';
        }
        String answer = new String(c).replaceAll(" ","");
        return answer;
    }
}