package chap02Practice;

import java.util.Scanner;

/*
 * ��� ��ȯ ������ �ڼ��� ��Ÿ���� ���α׷��� �ۼ��ϼ���.(70p)
 */
public class C2Q07 {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "01234566789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char result;
		
		System.out.println(r + " |       " + x);
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			
			System.out.println("  + --------");
			if(x != 0) {
				System.out.println(r + " |       " + x + " ''' " + d[digits-1]);				
			}
		}while(x != 0);
		System.out.println("          " + x + " ''' " + d[digits-1]);			
		
		// �Ʒ��ڸ� ���ڸ� ��ȯ
		for(int i = 0; i < digits / 2; i++) {
			char first = d[i];
			d[i] = d[digits - 1 - i];
			d[digits - 1 - i] = first;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;								// ��ȯ�ϴ� ����
		int cd;								// ���
		int dno;								// ��ȯ ���� �ڸ���
		int retry;								// �ٽ� �� ��?
		char[] cno = new char[32];		// ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = sc.nextInt();
			}while(no < 0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = sc.nextInt();
			}while(cd < 2 || cd > 36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for(int i = 0; i <  dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.print("�ѹ� �� �ұ��? (1.�� / 0.�ƴϿ�) : ");
			retry = sc.nextInt();
		}while(retry == 1);

	}
}
