package chap01_Practice;

public class Q01 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if (b > max) max = b;
		if (c > max) max = c;
		if (d > max) max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max4(4, 5, 6, 7) : " + max4(4, 5, 6, 7));
	}
}
