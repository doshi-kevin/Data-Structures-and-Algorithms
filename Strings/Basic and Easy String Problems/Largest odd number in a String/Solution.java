class Solution {
    public String largestOddNumber(String num) {
        int i = num.length();
        if(i<=0){
            return "";
        }
        if((num.charAt(i-1)-'0')%2==1){
            return num;
        }
        return largestOddNumber(num.substring(0, i-1));
    }
}