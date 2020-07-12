package chap02;

import java.util.Scanner;

/*
 * �Է� ���� 10������ 2���� ~ 36������ ��� ��ȯ�Ͽ� ��Ÿ��
 */
public class CardConvRev {
	// �ǽ� 2-8[A]
	static int cardConvR(int x, int r, char[] d ) {
		int digits = 0;
		String dchar = "01234566789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		}while(x != 0);
		
		return digits;
	}
	
	// �ǽ� 2-8[B]
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
			
			dno = cardConvR(no, cd, cno);
			
			System.out.print(cd + "�����δ� ");
			for(int i = dno - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.print("�ѹ� �� �ұ��? (1.�� / 0.�ƴϿ�) : ");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
