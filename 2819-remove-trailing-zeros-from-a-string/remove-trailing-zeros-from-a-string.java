class Solution {
    public String removeTrailingZeros(String num) {
        StringBuffer sb = new StringBuffer(num);
        sb.reverse();
        num = sb.toString();
        int a = 0;
        for(int i = 0;i<num.length();i++){
            if(num.charAt(i)=='0'){

            }
            else{
                a = i;
                break;
            }
        }
        StringBuffer s = new StringBuffer(num.substring(a,num.length()));s.reverse();
        return s.toString();
    }
}