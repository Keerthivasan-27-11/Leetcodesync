class Solution {
    public boolean checkString(String s) {
        int a = 0;
        boolean b = true;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='a' && a!=-1){
                a = 1;
            }else if(s.charAt(i)=='b'){
                a = -1;
            }else{
                b = false;
            }
        }
        return b;
    }
}