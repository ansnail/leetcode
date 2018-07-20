package leetcode;

public class Utils {
	
	private static String array2String(int[] js) {
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < js.length; i++) {
			builder.append(js[i]);
			if (i != js.length -1) {
				builder.append(",");
			}
		}
		builder.append("]");
		return builder.toString();
	}
	
	public static void printArray(int[] js) {
		System.out.println(array2String(js));
	}
	
	public static void printArray(String tag, int[] js) {
		System.out.println(tag +" : "+ array2String(js));
	}
	
	
	

}
