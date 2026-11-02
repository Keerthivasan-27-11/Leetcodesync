class Solution {
    public String finalString(String s) {
        StringBuffer sb = new StringBuffer("");
        for(int i = 0;i<s.length();i++){
            if(s.substring(i,i+1).equals("i")){
                sb.reverse();
            }
            else{
                sb.append(s.substring(i,i+1));
            }
        }
        return sb.toString();
    }
}