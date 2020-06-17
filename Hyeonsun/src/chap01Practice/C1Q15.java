package chap01Practice;

import java.util.Scanner;

public class C1Q15 {
	public static void main(String[] args) {
		/*
		 * ��������Q15
		 * ���� �̵ �ﰢ���� ����ϴ� �κ��� �Ʒ��� ���� ������ �޼���� �ۼ��Ͻÿ�
		 * 
		 * ���� �Ʒ��� ������ �̵ �ﰢ���� ����Ͻÿ�
		 * static void triangleLB(int n)
		 * 
		 * �� ���� ��, ������ ��, ������ �Ʒ��� ������ �̵ �ﰢ���� ����ϴ� �޼��带 �ۼ��Ͻÿ�
		 * static void triangleLU(int n)
		 * static void triangleRU(int n)
		 * static void triangleRB(int n)
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("�� �� �ﰢ���Դϱ�? : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
//		triangleLB(n);
//		triangleLU(n);
//		triangleRU(n);
		triangleRB(n);
	}
	
	static void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ���� ���� ������ �̵ �ﰢ��
	static void triangleLU(int n) {
		for(int i = n; i >= 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ������ ���� ������ �̵ �ﰢ��
	static void triangleRU(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = i-1; k < n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// ������ �Ʒ��� ������ �̵ �ﰢ��
	static void triangleRB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
