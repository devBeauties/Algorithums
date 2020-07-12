package chap02Practice;

import java.util.Scanner;

/*
 * ������ó�� �迭 ��Ҹ� �������� �����ϴ� ������ �ϳ��ϳ� ��Ÿ���� ���α׷��� �ۼ��ϼ���.
 * 
 * ['������ó��'�� ����]
 * 5 10 73 2 -5 42
 * a[0]�� a[5]�� ��ȯ�մϴ�.
 * 42 10 73 2 -5 5
 * a[1]�� a[4]�� ��ȯ�մϴ�.
 * 42 -5 73 2 10 5
 * a[2]�� a[3]�� ��ȯ�մϴ�.
 * 42 -5 2 73 10 5
 * ���� ������ ���ƽ��ϴ�.
 */
public class C2Q02 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void print(int[] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	static void reverse(int[] a) {
		print(a);
		for(int i = 0; i < a.length / 2; i++) {
			System.out.println("a[" + i + "]�� a[" + (a.length - i -1) + "]�� ��ȯ�մϴ�.");
			swap(a, i, a.length - i -1);
			print(a);
		}
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ڼ�  : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		reverse(a);
		
//		System.out.println("���� ������ ���ƽ��ϴ�.");
		
	}

}
