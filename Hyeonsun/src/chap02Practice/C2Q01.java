package chap02Practice;

import java.util.Random;
import java.util.Scanner;

/*
 * 키뿐만 아니라 사람 수도 난수로 생성하도록
 * 실습2-5를 수정하여 프로그램을 작성하세요.
 */
public class C2Q01 {
	// 가장 큰 키
	static int maxOf(int[] a) {
		int t = a[0];
		for(int i = 1; i < a.length; i++) {
			if(t < a[i]) {
				t = a[i];
			}
		}
		return t;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		// 사람 수
		int num = rand.nextInt(5) + 1;
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("요솟수 : " + num);
		
		// 사람 배열
		int[] a = new int[num];
		
		// 사람 키 생성
		for(int i = 0; i < num; i++) {
			a[i] = 100 + rand.nextInt(90);
		}
		
		// 가장 키 큰 사람 출력
		System.out.println("가장 큰 사람 = " + maxOf(a));
	}

}
