package chap02Practice;

import java.util.Scanner;

/*
 * �迭 b�� ��� ��Ҹ� �迭 a�� �������� �����ϴ� �޼��� rcopy�� �ۼ��ϼ���.
 * static void rcopy(int[] a, int[] b)
 */
public class C2Q5 {
	static void rcopy(int[] a, int[] b) {
		for(int i = b.length - 1; i >= 0 ; i--) {
			a[b.length - 1 - i] = b[i];
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
		
		rcopy(a, b);
		
		System.out.print("����� �迭 a�� : ");
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
