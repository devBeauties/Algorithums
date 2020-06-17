package chap01.practice;

import java.util.Scanner;

public class C1Q14 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q14
		 * 입력한 수를 한 변으로 하는 정사각형을 
		 * * 기호로 출력하는 프로그램을 작셍하시오
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
