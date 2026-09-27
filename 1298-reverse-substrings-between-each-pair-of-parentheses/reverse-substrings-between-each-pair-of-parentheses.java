class Solution {
    public String reverseParentheses(String s) {
        int a = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.substring(i,i+1).equals("(")) {
				a++;
			}
		}
		int k = 0,b = new Integer(a);
		while(k!=b){
			int n = 0,n1 = 0;
			for(int j = 0;j<s.length();j++) {
				if(s.substring(j,j+1).equals("(")) {
					n++;
					if(n == a) {
						n = j;
						break;
					}
				}
			}String str = "";
			for(int j = n+1;j<s.length();j++) {
				if(s.substring(j,j+1).equals(")")) {
					n1 = j;
					break;
				}
				else {
					str+=s.substring(j,j+1);
				}
			}a--;
			StringBuffer sb = new StringBuffer(str);
			sb.reverse();
			s = s.substring(0,n)+sb.toString()+s.substring(n1+1,s.length());
			k++;
		}return s;
    }
}