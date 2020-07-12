package chap02Practice;

import java.util.Scanner;

/*
 * �޼��� dayOfYear�� ���� i�� days ���� �����ϼ���. while���� ����ϼ���.
 */
public class C2Q8 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	//���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	//����
	};
	
	static int isLeap(int year) {	//1 : ���� / 0: ���
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;	
	}
	
	static int dayOfYear(int y, int m, int d) {
		while(--m != 0) {		
			d += mdays[isLeap(y)][m-1];
			System.out.println(m);
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
			
			System.out.printf("�� �� %d��°�Դϴ�.\n", dayOfYear(year, month, day));
			
			System.out.print("�� �� �� �ұ��? 1.�� / 0.�ƴϿ� : ");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
