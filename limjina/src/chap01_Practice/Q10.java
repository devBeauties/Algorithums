package chap01_Practice;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int result;
		
		System.out.print("a의 값 : ");
		a = scan.nextInt();
		
		do {
			System.out.print("b의 값 : ");
			b = scan.nextInt();
			if (b <= a) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}
		} while (b <= a);
		
		result = b - a;
		System.out.println("b - a는 " + result + "입니다.");
		
		scan.close();
	}
}
