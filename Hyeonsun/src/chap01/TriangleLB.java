package chap01;

import java.util.Scanner;

public class TriangleLB {
	public static void main(String[] args) {
		/*
		 * �ǽ�1-8
		 * ���� �Ʒ��� ������ �̵ �ﰢ���� ����Ͻÿ�
		 */

		Scanner stdIn = new Scanner(System.in);
		int n;
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����Ͻÿ�");
		
		do {
			System.out.println("�� �� �ﰢ���Դϱ�? : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
