package chap01Practice;

import java.util.Scanner;

public class C1Q07 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q7
		 * 실습1-5 프로그램을 참고하여 n이 7이면 
		 * '1+2+3+4+5+6+7=28'로 출력하는 프로그램을 작성하세요.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;

		for(int i = 1; i <= n; i++) {
			sum += i;
		
			if(i == 1) {
				System.out.print(i);
			}
			else if(i > 1 && i < n) {
				System.out.print(" + ");
				System.out.print(i);
			}else {
				System.out.print(" + ");
				System.out.print(i);
				System.out.print(" = ");
				System.out.print(sum);
			}
		}
	}
}
