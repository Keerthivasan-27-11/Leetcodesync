class Solution {
    public String mergeAlternately(String word1, String word2) {
        int min = Math.min(word1.length(),word2.length());
        String res = "";


        
        for(int i = 0;i<min;i++){
            res += word1.substring(i,i+1);
            res += word2.substring(i,i+1);
        }
        if(word1.length()>min){
            res+=word1.substring(min,word1.length());
        }
        else if(word2.length()>min){
            res+=word2.substring(min,word2.length());
        }
        return res;
    }
}
