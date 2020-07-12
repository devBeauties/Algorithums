package chap02_Practice;

import java.util.Scanner;

public class Q03 {
	static int sumof(int[] a) {
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		int[] a = new int[num];
		
		for (int i = 0; i < a.length; i++) {
			System.out.print("숫자 : ");
			a[i] = scan.nextInt();
		}
		
		System.out.println("합계는 " + sumof(a) + "입니다.");
		
		scan.close();
	}
}
