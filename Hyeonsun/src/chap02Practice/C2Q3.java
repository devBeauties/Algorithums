package chap02Practice;

import java.util.Scanner;

/*
 * 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
 * 
 * static int sumOf(int[] a)
 */
public class C2Q3 {
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("합계 : " + sumOf(a));
	}

}
