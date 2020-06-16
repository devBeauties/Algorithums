package chap01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		/*
		 * 실습1-3
		 * 조건 판단과 분기
		 */

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = stdIn.nextInt();
		
		if(n > 0) {
			System.out.println("양수 입니다");
		}else if(n < 0) {
			System.out.println("음수 입니다");
		}else{
			System.out.println("0 입니다");
		}
		
//		if(n == 1) {
//			System.out.println("1입니다");
//		}else if(n == 2) {
//			System.out.println("2입니다");
//		}else{
//			System.out.println("3입니다");
//		}
	}
}
