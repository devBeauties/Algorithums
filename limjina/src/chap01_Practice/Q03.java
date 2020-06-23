package chap01_Practice;

public class Q03 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if (b < min) min = b;
		if (c < min) min = c;
		if (d < min) min = d;
		
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println("min4(4, 5, 6, 7) : " + min4(4, 5, 6, 7));
	}
}
