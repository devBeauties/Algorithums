package chap02Practice;

import java.util.Scanner;

/*
 * �迭 b�� ��� ��Ҹ� �迭 a�� �����ϴ� �޼��� copy�� �ۼ��ϼ���.
 * static void copy(int[] a, int[] b)
 */
public class C2Q4 {
	static void copy(int[] a, int[] b) {		
		for(int i = 0; i < b.length; i++) {
			a[i] = b[i];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 b�� ��ڼ� : ");
		int n = sc.nextInt();
		int[] b = new int[n];
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		copy(a, b);
		
		System.out.print("����� �迭 a�� : ");
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
