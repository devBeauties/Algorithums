package chap01Practice;

import java.util.Scanner;

public class C1Q11 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q11
		 * 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하시오. 
		 * 예를 들어 135를 입력하면 '그 수는 3자리입니다.'라고 출력하고, 
		 * 1314를 입력하면 '그 수는 4자리입니다'라고 출력하면 된다.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("양의 정수를 입력하세요.");
		
		do {
			System.out.print("n의 값 : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		String str = Integer.toString(n);
		
		System.out.println("그 수는 " + str.length() + "자리입니다.");
	}
}
