package chap01.practice;

import java.util.Scanner;

public class C1Q09 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q9
		 * 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반홚는 아래 메서드를 작성하세요.
		 * 
		 * static int sumof(int a, int b)
		 */
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();		
		
		int sum = sumof(a, b);
		System.out.println(a + "부터 " + b + "까지의 합은 " + sum + "입니다.");		
	}
	static int sumof(int a, int b) {		
		int sum = 0;
		
		for(int i = a; i <= b; i++)
			sum += i;
		
		return sum;
	}
}
