package chap01.practice;

import java.util.Scanner;

public class C1Q10 {
	public static void main(String[] args) {
		/*
		 * ��������Q10
		 * �� ���� a, b�� ������ �Է��ϰ� b - a�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * (��, ���� b�� �Է��� ���� a ���ϸ� ���� b�� ���� �ٽ� �Է��Ͻÿ�) 
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		
		System.out.println("b - a�� ���� ���ϼ���");
		System.out.print("a�� �� : ");
		a = stdIn.nextInt();
		
		do {
			System.out.print("b�� �� : ");
			b = stdIn.nextInt();
		}while(b <= a);
		
		int minus = b - a;
		
		System.out.println("b - a �� ���� : " + minus);
	}
}
