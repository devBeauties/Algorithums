package chap01Practice;

import java.util.Scanner;

public class C1Q17 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q17
		 * 아래를 향한 n단의 숫자 피라미드를 출력하는 메서드를 작성하시오
		 * 
		 * static void npira(int n)
		 * i행에 출력하는 숫자는 i%10으로 구하시오
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("몇 단 삼각형입니까? : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		npira(n);
	}
	static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= (i-1)*2; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
