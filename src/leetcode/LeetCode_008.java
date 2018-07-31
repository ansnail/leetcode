package leetcode;

public class LeetCode_008 {

	public static void main(String[] args) {
		System.out.println(myAtoi2("+0  78"));
	}
	
	public static int myAtoi2(String str) {
        int index = 0;
        long out = 0;
        boolean positive = true;
        while (index < str.length() && str.charAt(index) == ' '){
            ++index;
            System.out.println("index="+index);
        }
        if (index < str.length() && str.charAt(index) == '-'){
            positive = false;
            ++index;
        }
        else if (index < str.length() && str.charAt(index) == '+'){
            ++index;
        }
        while (index < str.length() && Character.isDigit(str.charAt(index))){
            out = out * 10 + str.charAt(index) - '0';
            if (out > Integer.MAX_VALUE){
                return positive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ++index;
        }
        return positive ? (int) out : (int) -out;
    }
	
	public static int myAtoi(String str) {
		char[] dummy = str.toCharArray();
		int sum = 0;
		int flag = 0;
		boolean start = false;
		for (int i = 0; i < dummy.length; i++) {
			if (dummy[i] == '-' && sum == 0) {
				if (flag != 0 || start) {
					return 0;
				}else {
					flag = -1;
				}
			}else if (dummy[i] == '+' && sum == 0) {
				if (flag != 0 || start) {
					return 0;
				}else {
					flag = 1;
				}
			}else  if (dummy[i] >= '0' && dummy[i] <= '9') {
				start = true;
				System.out.println("sum=" + sum + ",flag=" + flag);
				if (flag == -1) {
					if (sum * -1 < Integer.MIN_VALUE / 10 || (sum * -1 == Integer.MIN_VALUE / 10 && -(dummy[i] - 48) < -8)) {
						return Integer.MIN_VALUE;
					}
				} else {
					if (sum > Integer.MAX_VALUE / 10 || (sum == Integer.MAX_VALUE / 10 && (dummy[i] - 48) > 7)) {
						return Integer.MAX_VALUE;
					}
				}
				sum = sum * 10 + (dummy[i] - 48);
			} else if (dummy[i] == ' ' && sum == 0) {
				if (start) {
					return 0;
				}
				if (flag != 0) {
					return 0;
				}
			} else {
				if (sum == 0) {
					return 0;
				} else {
					if (flag == -1) {
						return sum * flag;
					}else {
						return sum;
					}
					
				}
			}
		}
		if (flag == -1) {
			return sum * flag;
		}else {
			return sum;
		}
	}

}
