package chap01;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		/*
		 * �ǽ�1C-2
		 * 2�ڸ��� ���(10~99)�� �Է��Ѵ�.
		 */

		Scanner stdIn = new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���");
		
		do {
			System.out.print("n�� �� : ");
			no = stdIn.nextInt();
		}while(no < 10 || no > 99);
		
		System.out.println("���� no�� ����  " + no + "��(��) �Ǿ����ϴ�.");
	}
}
