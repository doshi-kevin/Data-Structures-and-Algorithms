class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String t = s + s;
        if(t.contains(goal)){
            return true;
        }
        return false;
    }
}