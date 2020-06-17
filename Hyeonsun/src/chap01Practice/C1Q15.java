package chap01Practice;

import java.util.Scanner;

public class C1Q15 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q15
		 * 직각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하시오
		 * 
		 * 왼쪽 아래가 직각인 이등변 삼각형을 출력하시오
		 * static void triangleLB(int n)
		 * 
		 * 또 왼쪽 위, 오른쪽 위, 오른쪽 아래가 직각인 이등변 삼각형을 출력하는 메서드를 작성하시오
		 * static void triangleLU(int n)
		 * static void triangleRU(int n)
		 * static void triangleRB(int n)
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
//		triangleLB(n);
//		triangleLU(n);
//		triangleRU(n);
		triangleRB(n);
	}
	
	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {
		for(int i = n; i >= 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 위가 직각인 이등변 삼각형
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = i-1; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// 오른쪽 아래가 직각인 이등변 삼각형
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
