class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer =new StringBuilder(my_string)
            .replace(num1, num1+1, my_string.substring(num2, num2+1))
            .replace(num2, num2+1, my_string.substring(num1, num1+1))
            .toString();
        return answer;
    }
}