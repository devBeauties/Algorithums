package chap01.practice;

import java.util.Scanner;

public class C1Q06 {
	public static void main(String[] args) {
		/*
		 * �������� Q6
		 * �ǽ�1-4���� while���� ����� �� ���� i���� n + 1�� ���� Ȯ���ϼ���
		 * (���� i���� ����ϵ��� ���α׷��� �����ϼ���.)
		 */

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i <= n) {
			System.out.println("���� i�� ���� " + i + "�Դϴ�.");
			sum += i;
			i++;
		}
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");		
	}
}
