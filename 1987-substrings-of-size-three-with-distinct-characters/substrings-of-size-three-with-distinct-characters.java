class Solution {
    public int countGoodSubstrings(String s) {
        int a = 0;
        for(int i = 0;i<s.length()-2;i++){
            Set<String> has = new HashSet<>();
            String str = new String(s.substring(i,i+3));
            has.add(str.substring(0,1));
            has.add(str.substring(1,2));
            has.add(str.substring(2,3));
            if(has.size()==3){
                a++;
            }
        }return a;
    }
}