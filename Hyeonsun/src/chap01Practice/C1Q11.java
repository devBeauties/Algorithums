package chap01Practice;

import java.util.Scanner;

public class C1Q11 {
	public static void main(String[] args) {
		/*
		 * ��������Q11
		 * ���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 * ���� ��� 135�� �Է��ϸ� '�� ���� 3�ڸ��Դϴ�.'��� ����ϰ�, 
		 * 1314�� �Է��ϸ� '�� ���� 4�ڸ��Դϴ�'��� ����ϸ� �ȴ�.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("���� ������ �Է��ϼ���.");
		
		do {
			System.out.print("n�� �� : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		String str = Integer.toString(n);
		
		System.out.println("�� ���� " + str.length() + "�ڸ��Դϴ�.");
	}
}
