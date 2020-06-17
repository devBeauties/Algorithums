package chap01Practice;

import java.util.Scanner;

public class C1Q16 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q16 
		 * n단의 피라미드를 출력하는 메서드를 작성하시오
		 * 
		 * static void spria(int n)
		 * 
		 * i행에는 (i-1)*2+1개의 기호 문자 *가 출력되게 하시오.
		 * (마지막 n행에는 (n-1)*2+1개의 기호 문자 *를 출력하게 된다.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		spria(n);
	}
	static void spria(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= (i-1)*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
