package chap01Practice;

import java.util.Scanner;

public class C1Q17 {
	public static void main(String[] args) {
		/*
		 * ��������Q17
		 * �Ʒ��� ���� n���� ���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��Ͻÿ�
		 * 
		 * static void npira(int n)
		 * i�࿡ ����ϴ� ���ڴ� i%10���� ���Ͻÿ�
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("�� �� �ﰢ���Դϱ�? : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		npira(n);
	}
	static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= (i-1)*2; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
