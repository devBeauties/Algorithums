package chap01;

import java.util.Scanner;

public class SumWhile {
	public static void main(String[] args) {
		/*
		 * �ǽ�1-4
		 * 1,2,..,n�� ���� ���Ѵ�.
		 */

		Scanner stdIn = new Scanner(System.in);
				
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");		
	}
}
