package chap02Practice;

import java.util.Scanner;

/*
 * ������ó�� ���� ������� �ʵ�� ���� Ŭ������ ���弼��. 
 * ������ ���� �����ڿ� �޼��带 �����ؾ� �մϴ�.
 * 
 * ������(�־��� ��¥�� ����)
 * YMD(int y, int m int d)
 * 
 * n�� ���� ��¥�� ��ȯ
 * YMD ater(int n)
 * 
 * n�� ���� ��¥�� ��ȯ
 * YMD before(int n)
 */
public class C2Q11 {
	private int y;
	private int m;
	private int d;
	
	public C2Q11(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	C2Q11 after(int n) {
//		n += n;
		C2Q11 temp = new C2Q11(this.y, this.m, this.d); 
		if (n < 0)
			return (before(-n));

		temp.d += n;

		while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
			if (++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		return temp;
	}
	
	C2Q11 before(int n) {
//		n -= n;
		C2Q11 temp = new C2Q11(this.y, this.m, this.d);
		if (n < 0)
			return (after(-n));

		temp.d -= n;

		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m - 1];
		}
		return temp;
	}
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	//���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	//����
	};
	
	static int isLeap(int year) {	//1 : ���� / 0: ���
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.print("��¥�� �Է��ϼ���.\n");
		
		do {
			System.out.print("�� : "); int year = sc.nextInt();
			System.out.print("�� : "); int month = sc.nextInt();
			System.out.print("�� : "); int day = sc.nextInt();
			
			C2Q11 today = new C2Q11(year, month, day);
			
			System.out.print("�� �� ��/���� ��¥�� ���ұ��?��");
			int n = sc.nextInt();
			
			C2Q11 d1 = today.after(n);
			System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d1.y, d1.m, d1.d);
			
			C2Q11 d2 = today.before(n);
			System.out.printf("%d�� ���� ��¥�� %d�� %d�� %d���Դϴ�.\n", n, d2.y, d2.m, d2.d);
			
			System.out.print("�� �� �� �ұ��? 1.�� / 0.�ƴϿ� : ");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
