package chap02Practice;

import java.util.Scanner;

/*
 * y�� m�� d���� �� �� ���� �� �� (12�� 31���̸� 9, 12�� 30���̸� 1)�� ���ϴ� �Ʒ� �޼��带 �ۼ��ϼ���.
 * static int leftDayOfYear(int y, int m, int d)
 */
public class C2Q9 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	//���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	//����
	};
	
	static int isLeap(int year) {	//1 : ���� / 0: ���
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;	
	}

	static int leftDayOfYear(int y, int m, int d) {
		while(--m != 0) {
			d += mdays[isLeap(y)][m-1];
			System.out.println(m);
		}	
		
		if(isLeap(y) == 0) {		// 0 : ���, 365
			d = 365 - d;
		}else {
			d = 366 - d;
		}
		
		return d;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("�� �� ��� �ϼ��� ���մϴ�.");
		
		do {
			System.out.print("�� : "); int year = sc.nextInt();
			System.out.print("�� : "); int month = sc.nextInt();
			System.out.print("�� : "); int day = sc.nextInt();
			
			System.out.printf("�� �� %d�� ���ҽ��ϴ�.\n", leftDayOfYear(year, month, day));
			
			System.out.print("�� �� �� �ұ��? 1.�� / 0.�ƴϿ� : ");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
