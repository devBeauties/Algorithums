package chap01_exe;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구하시오.");
		System.out.print("n의 값 : ");

		int n = stdIn.nextInt();
		int sum;

		if ((n % 2) == 0) {
			sum = (1 + n) * (n / 2);
		} else {
			sum = (1 + n) * (n / 2) + (n / 2) + 1;
		}
		System.out.println("합의 값은 : "+sum);
	}
}
