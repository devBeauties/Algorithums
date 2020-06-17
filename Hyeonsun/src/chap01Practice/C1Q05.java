package chap01Practice;

import java.util.Scanner;

public class C1Q05 {
	public static void main(String[] args) {
		/*
		 * �������� Q5
		 * �߾Ӱ��� ���ϴ� �޼���� ������ ���� �ۼ��� ���� �ִ�. 
		 * �׷��� Median.java�� med3()���� ȿ���� �������µ� �� ������ �����ϼ���.
		 */
		
		/* 
		 * Median.java�� med3()������ if(a >= b)���� �б�� ����� ���� �ݴ�Ǵ� �б⸦ if(a >= b)�� else if�� �ΰ� �ִ�.
		 * ������ ���������� med3()������ �����ؾ� �� ���� ���ؾ� �� ����� ���� ��������.
		 * 
		 * �ش�
		 * ���� ó���� if���� �Ǵ�
		 * 	if ((b >= a && c<= a) || (b <= a && c >= a))
		 * 	�� �ָ��մϴ�. ���⼭ b >= a �� b <= a�� �Ǵ��� ������ �Ǵ�(���������� ���� �Ǵ�)�� �̾����� else ������
		 * 	else if ((a > b && c < b) || (b <= a && c > b))
		 * 	���� �����մϴ�. �ᱹ ���� ó���� if�� ������ ��� 2 ��°�� if������ (����������)���� �Ǵ��� �����ϹǷ� ȿ���� �������ϴ�.
		 */
	}
	
	static int med3 (int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if((a > b && c < b) || ( a < b && c > b))
			return b;
		return c;
	}
}
