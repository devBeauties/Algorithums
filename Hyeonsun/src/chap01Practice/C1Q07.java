package chap01Practice;

import java.util.Scanner;

public class C1Q07 {
	public static void main(String[] args) {
		/*
		 * ��������Q7
		 * �ǽ�1-5 ���α׷��� �����Ͽ� n�� 7�̸� 
		 * '1+2+3+4+5+6+7=28'�� ����ϴ� ���α׷��� �ۼ��ϼ���.
		 */
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;

		for(int i = 1; i <= n; i++) {
			sum += i;
		
			if(i == 1) {
				System.out.print(i);
			}
			else if(i > 1 && i < n) {
				System.out.print(" + ");
				System.out.print(i);
			}else {
				System.out.print(" + ");
				System.out.print(i);
				System.out.print(" = ");
				System.out.print(sum);
			}
		}
	}
}
