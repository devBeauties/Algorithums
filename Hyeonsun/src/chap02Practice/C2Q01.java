package chap02Practice;

import java.util.Random;
import java.util.Scanner;

/*
 * Ű�Ӹ� �ƴ϶� ��� ���� ������ �����ϵ���
 * �ǽ�2-5�� �����Ͽ� ���α׷��� �ۼ��ϼ���.
 */
public class C2Q01 {
	// ���� ū Ű
	static int maxOf(int[] a) {
		int t = a[0];
		for(int i = 1; i < a.length; i++) {
			if(t < a[i]) {
				t = a[i];
			}
		}
		return t;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		// ��� ��
		int num = rand.nextInt(5) + 1;
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.println("��ڼ� : " + num);
		
		// ��� �迭
		int[] a = new int[num];
		
		// ��� Ű ����
		for(int i = 0; i < num; i++) {
			a[i] = 100 + rand.nextInt(90);
		}
		
		// ���� Ű ū ��� ���
		System.out.println("���� ū ��� = " + maxOf(a));
	}

}
