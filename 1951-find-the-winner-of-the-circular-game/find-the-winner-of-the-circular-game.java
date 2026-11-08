class Solution {
    public int findTheWinner(int n, int k) {
        int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = i + 1;
		}
		int a = 0, b = -1;
		if (k == 1) {
			b = nums[nums.length - 1];
		}
		if (k != 1) {
			while (true) {
				int j = 0;
				for (int i : nums) {
					if (i != -1) {
						j++;
						b = i;
					}
				}
//				for (int i : nums) {
//					System.out.print(i);
//				}
//				System.out.println();
				if (j == 1) {
					break;
				}
				for (int i = 0; i < n; i++) {
					if (nums[i] != -1) {
						if (nums[i] != -1) {
							a++;
						}
						if (a == k) {
							a = 0;
							nums[i] = -1;
						}
					}
				}
			}
		}return b ;
    }
}