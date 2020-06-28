package chap01_exe;
import java.util.Scanner;

public class Q15 {

	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRU(int n) {
		for(int i = 0; i < n; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print("  ");
			}
			for(int j = n-i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = n+1-i; j > 1; j--) {
				System.out.print("  ");
			}
			for(int k = 0; k < i; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("단을 입력하세요 : ");
		int n = stdIn.nextInt();
		triangleRB(n);
	}

}
