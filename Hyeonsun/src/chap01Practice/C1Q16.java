package chap01Practice;

import java.util.Scanner;

public class C1Q16 {
	public static void main(String[] args) {
		/*
		 * ��������Q16 
		 * n���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��Ͻÿ�
		 * 
		 * static void spria(int n)
		 * 
		 * i�࿡�� (i-1)*2+1���� ��ȣ ���� *�� ��µǰ� �Ͻÿ�.
		 * (������ n�࿡�� (n-1)*2+1���� ��ȣ ���� *�� ����ϰ� �ȴ�.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("�� �� �ﰢ���Դϱ�? : ");
			n = stdIn.nextInt();
		}while(n <= 0);
		
		spria(n);
	}
	static void spria(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k <= (i-1)*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
