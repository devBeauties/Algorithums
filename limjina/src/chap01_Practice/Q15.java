package chap01_Practice;

public class Q15 {
	// ���� �Ʒ��� ������ �̵ �ﰢ��
	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ���� ���� ������ �̵ �ﰢ��
	static void triangleLU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ������ ���� ������ �̵ �ﰢ��
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ������ �Ʒ��� ������ �̵ �ﰢ��
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
//		triangleLB(5);
//		triangleLU(5);
//		triangleRU(5);
//		triangleRB(5);
	}
}
