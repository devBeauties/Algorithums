package chap01_exe;

import java.util.Scanner;

public class Q17 {
	static void npira(int n) {
		for (int k = 0; k < n; k++) {
			for (int i = n-k; i > 1; i--) {
				System.out.print("  ");
			}
			for (int j = 0; j < 1+(k*2); j++) {
				System.out.print(k+1);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 단을 입력하세요 : ");
		int n = sc.nextInt();
		npira(n);
	}

}
