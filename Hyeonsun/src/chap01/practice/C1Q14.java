package chap01.practice;

import java.util.Scanner;

public class C1Q14 {
	public static void main(String[] args) {
		/*
		 * ��������Q14
		 * �Է��� ���� �� ������ �ϴ� ���簢���� 
		 * * ��ȣ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 */
		
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
