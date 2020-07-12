package chap01_Practice;

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("n의 값 : ");
		int n = scan.nextInt();
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		
		System.out.println("1부터 " + n + "n까지의 합 : " + sum);
		
		scan.close();
	}
}
