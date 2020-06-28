package chap01_Practice;

public class Q16 {
	static void spira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print("*");
			}
//			for(int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			for(int j = 1; j <= i - 1; j++) {
//				System.out.print("*");
//			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		spira(5);
	}
}
