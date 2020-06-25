package chap01_Practice;

import java.util.Scanner;

public class Q11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("양의 정수 입력 : ");
			n = scan.nextInt();
		} while (n <= 0);
		
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}
		
		System.out.println("그 수는 " + count + "자리입니다.");
		
		scan.close();
	}
}
