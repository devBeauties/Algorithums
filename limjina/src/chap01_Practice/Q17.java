package chap01_Practice;

public class Q17 {
	static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		npira(7);
	}
}
