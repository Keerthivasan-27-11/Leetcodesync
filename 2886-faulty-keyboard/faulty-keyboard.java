class Solution {
    public String finalString(String s) {
        String str ="";
        for(int i = 0;i<s.length();i++){
            if(s.substring(i,i+1).equals("i")){
                StringBuffer sb = new StringBuffer(str);
                sb.reverse();
                str=sb.toString();
            }
            else{
                str+=s.substring(i,i+1);
            }
        }
        return str;
    }
}