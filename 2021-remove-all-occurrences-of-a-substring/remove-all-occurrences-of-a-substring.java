class Solution {
    public String removeOccurrences(String s, String part) {
         int j = 0;
        while(j!=1){StringBuffer sb = new StringBuffer(s);
            int b = 0;
            for(int i = 0;i<s.length()-part.length()+1;i+=1){
                if(s.substring(i,i+part.length()).equals(part)){
                    sb.delete(i,i+part.length());
                    b++;
                    break;
                }
            }
            s = sb.toString();
            if(s.length()<part.length() || b==0){
                j = 1;
            }
        }return s;
    }
}