class Solution {
    public int countGoodSubstrings(String s) {
        int a = 0;
        for(int i = 0;i<s.length()-2;i++){
            Set<String> has = new HashSet<>();
            String str = new String(s.substring(i,i+3));
            for(int j = 0;j<3;j++){
                has.add(str.substring(j,j+1));
            }
            if(has.size()==3){
                a++;
            }
        }return a;
    }
}