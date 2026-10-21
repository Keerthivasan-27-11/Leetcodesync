class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<String> li = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        for(String i : nums){
            l1.add(i);
        }String res = "";
        for(int i = 0;i<(int)Math.pow(2,nums.length);i++) {
            String str = String.format("%016d", Long.parseLong(Long.toBinaryString(i)));
            li.add(str.substring(str.length() - nums.length, str.length()));
        }
        for(String i:li){
            if(l1.contains(i)){

            }else{
                res = i;
                break;
            }
        }return res;
    }
}