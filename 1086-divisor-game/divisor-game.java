class Solution {
    public boolean divisorGame(int n) {
        boolean b = false;int a = 0;
        while(n!=1){
            for(int j = 1;j<n;j++){
                if(n%j==0){
                    if(a == 0){
                    a = 1;}else{
                        a = 0;
                    }
                    n-=j;break;
                }
            }

        }
        if(a == 1){
            b = true;
        }
        return b;
    }
}