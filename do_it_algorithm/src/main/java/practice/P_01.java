package practice;
/**
 * 
 * ABOUT
 * 
 * DATE : 2022-09-18
 * @author : december3104
 * URL : 19page
 * COMMENT : 네 값의 최댓값을 구하는 max4 메서드를 작성하세요.
 */
public class P_01 {
	public static void main(String[] args) {
		System.out.println("max4(1, 4, 6, 2) = " + max4(1, 4,  6, 2));
	}
	
	public static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
}
