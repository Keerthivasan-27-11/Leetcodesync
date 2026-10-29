class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        for(int i = 0;i<arr.length-k;i++){
            int a = 0;
            for(int j = i;j<i+k;j++){
                a+=arr[j];
            }
            a=a/k;
            if(a>=threshold){
                count++;
            }
        }
         int a = 0;
            for(int j = arr.length-k;j<arr.length;j++){
                a+=arr[j];
            }
            a=a/k;
            if(a>=threshold){
                count++;
            }
        return count;
    }
}