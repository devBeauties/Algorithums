package chap01.practice;

import java.util.Scanner;

public class C1Q10 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q10
		 * 두 변수 a, b에 정수를 입력하고 b - a를 출력하는 프로그램을 작성하시오.
		 * (단, 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하시오) 
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("b - a의 값을 구하세요");
		System.out.print("a의 값 : ");
		a = stdIn.nextInt();
		
		do {
			System.out.print("b의 값 : ");
			b = stdIn.nextInt();
		}while(b <= a);
		
		int minus = b - a;
		
		System.out.println("b - a 의 값은 : " + minus);
	}
}
