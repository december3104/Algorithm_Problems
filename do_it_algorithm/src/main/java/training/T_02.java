package training;
/**
 * 
 * ABOUT
 * 
 * DATE : 2022-09-18
 * @author : december3104
 * URL : 없음
 * COMMENT : 3개의 정숫값 가운데 최댓값을 구하여 출력합니다.
 */
public class T_02 {
	public static void main(String[] args) {
		System.out.println("max3(3, 2, 1) = " + max3(3, 2, 1));
		System.out.println("max3(3, 2, 2) = " + max3(3, 2, 3));
		System.out.println("max3(3, 1, 2) = " + max3(3, 1, 2));
		System.out.println("max3(3, 2, 3) = " + max3(3, 2, 3));
		System.out.println("max3(2, 1, 3) = " + max3(2, 1, 3));
		System.out.println("max3(3, 3, 2) = " + max3(3, 3, 2));
		System.out.println("max3(3, 3, 3) = " + max3(3, 3, 3));
		System.out.println("max3(2, 2, 3) = " + max3(2, 2, 3));
		System.out.println("max3(2, 3, 1) = " + max3(2, 3, 1));
		System.out.println("max3(2, 3, 2) = " + max3(2, 3, 2));
		System.out.println("max3(1, 3, 2) = " + max3(1, 3, 2));
		System.out.println("max3(2, 3, 3) = " + max3(2, 3, 3));
		System.out.println("max3(1, 2, 3) = " + max3(1, 2, 3));
	}
	
	public static int max3(int a, int b, int c) {
		int max = a;
		
		if (b > max) max = b;
		if (c > max) max = c;
		
		return max;
	}
}
