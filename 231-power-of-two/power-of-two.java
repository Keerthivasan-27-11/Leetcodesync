class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean b = false;
		for(int i = 0;i<32;i++) {
			if(n==Math.pow(2, i)) {
				b = true;break;
			}
		}
		// if(b == false) {
		// 	for(int i = 0;i<32;i++) {
		// 		if(n==-Math.pow(2, i)) {
		// 			b = true;
		// 			break;
		// 		}
		// 	}
		// }
        return b;
    }
}