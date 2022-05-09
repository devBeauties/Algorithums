package chap02_exe;

import java.util.Scanner;

public class Q2 {

	static void swap(int[] a, int idx1, int idx2) {
		System.out.println(a[idx1]+"과(와) "+a[idx2]+"를 교환합니다.");
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i]+" ");
		System.out.println(" ");
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++)
			swap(a, i, a.length - i - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);

		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		reverse(x);
		System.out.println("역순 정렬을 마쳤습니다.");
	}

}
