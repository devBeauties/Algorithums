package chap02Practice;

import java.util.Scanner;

/*
 * 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요.
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
		
		System.out.print("배열 b의 요솟수 : ");
		int n = sc.nextInt();
		int[] b = new int[n];
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
		}
		
		copy(a, b);
		
		System.out.print("복사된 배열 a는 : ");
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
