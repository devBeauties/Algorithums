package chap01Practice;

import java.util.Scanner;

public class C1Q08 {
	public static void main(String[] args) {
		/*
		 * ��������Q8
		 * 1���� 10������ ���� (1+10)*5�� ���� ������� ���� �� �ֽ��ϴ�.
		 * ���콺�� �����̶�� ����� �̿��Ͽ� 1���� n������ ���� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = ((1+n)*n)/2;

		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}
