package chap02_Practice;

import java.util.Scanner;

public class Q04 {
	static void copy(int[] a, int[] b) {
		for (int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		
		int[] a = new int[num];
		int[] b = new int[num];
		
		for (int i = 0; i < b.length; i++) {
			System.out.print("숫자 : ");
			b[i] = scan.nextInt();
		}
		
		copy(a, b);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		scan.close();
	}
}
