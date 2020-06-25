package chap01_exe;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("while문이 종료될 때 변수 i의 값은 : "+i+"입니다.(i+1)");
		//마지막에 i는 i+1이 되므로 while문의 결과값은 false가 되어 반복이 종료된다.
	}

}
