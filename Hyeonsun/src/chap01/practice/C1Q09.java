package chap01.practice;

import java.util.Scanner;

public class C1Q09 {
	public static void main(String[] args) {
		/*
		 * ��������Q9
		 * ���� a, b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ���T�� �Ʒ� �޼��带 �ۼ��ϼ���.
		 * 
		 * static int sumof(int a, int b)
		 */
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("a���� b������ ���� ���մϴ�.");
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();		
		
		int sum = sumof(a, b);
		System.out.println(a + "���� " + b + "������ ���� " + sum + "�Դϴ�.");		
	}
	static int sumof(int a, int b) {		
		int sum = 0;
		
		for(int i = a; i <= b; i++)
			sum += i;
		
		return sum;
	}
}
