package chap01_Practice;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while (i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("while���� ����� �� ���� i�� ���� : " + i);
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		
		scan.close();
	}
}
