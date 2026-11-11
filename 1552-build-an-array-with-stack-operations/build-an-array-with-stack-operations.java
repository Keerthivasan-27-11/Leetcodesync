class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> li = new ArrayList<>();
        int max = 0;
        for(int i:target){
            max = Math.max(max,i);
        }
        for(int i = 1;i<=max;i++){
            boolean b = false;
            for(int j:target){
                if(i==j){
                    b = true;break;
                }
            }
            if(b==true){
                li.add("Push");
            }
            else{
                li.add("Push");
                li.add("Pop");
            }
        }
        return li;
    }
}