package chap01Practice;

import java.util.Scanner;

public class C1Q08 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q8
		 * 1부터 10까지의 합은 (1+10)*5와 같은 방법으로 구할 수 있습니다.
		 * 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = ((1+n)*n)/2;

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
