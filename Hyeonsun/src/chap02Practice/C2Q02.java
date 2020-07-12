package chap02Practice;

import java.util.Scanner;

/*
 * 오른쪽처럼 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.
 * 
 * ['오른쪽처럼'의 내용]
 * 5 10 73 2 -5 42
 * a[0]과 a[5]를 교환합니다.
 * 42 10 73 2 -5 5
 * a[1]과 a[4]를 교환합니다.
 * 42 -5 73 2 10 5
 * a[2]과 a[3]을 교환합니다.
 * 42 -5 2 73 10 5
 * 역순 정렬을 마쳤습니다.
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
			System.out.println("a[" + i + "]과 a[" + (a.length - i -1) + "]를 교환합니다.");
			swap(a, i, a.length - i -1);
			print(a);
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수  : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		reverse(a);
		
//		System.out.println("역순 정렬을 마쳤습니다.");
		
	}

}
