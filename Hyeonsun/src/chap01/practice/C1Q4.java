package chap01.practice;

public class C1Q4 {

	public static void main(String[] args) {
		/*
		 * �������� Q4
		 * �� ���� ��� ���� 13������ ��� ���տ� ���� �߾Ӱ��� ���Ͽ� ����϶�.
		 */

		System.out.println("�߾Ӱ��� " + median(3, 2, 1) + "�Դϴ�.");		// [A] a��b��c
		System.out.println("�߾Ӱ��� " + median(3, 2, 2) + "�Դϴ�.");		// [B] a��b��c
		System.out.println("�߾Ӱ��� " + median(3, 1, 2) + "�Դϴ�.");		// [C] a��c��b
		System.out.println("�߾Ӱ��� " + median(3, 2, 3) + "�Դϴ�.");		// [D] a��c��b
		System.out.println("�߾Ӱ��� " + median(2, 1, 3) + "�Դϴ�.");		// [E] c��a��b
		System.out.println("�߾Ӱ��� " + median(3, 3, 2) + "�Դϴ�.");		// [F] a��b��c
		System.out.println("�߾Ӱ��� " + median(3, 3, 3) + "�Դϴ�.");		// [G] a��b��c
		System.out.println("�߾Ӱ��� " + median(2, 2, 3) + "�Դϴ�.");		// [H] c��a��b
		System.out.println("�߾Ӱ��� " + median(2, 3, 1) + "�Դϴ�.");		// [I] b��a��c
		System.out.println("�߾Ӱ��� " + median(2, 3, 2) + "�Դϴ�.");		// [J] b��a��c
		System.out.println("�߾Ӱ��� " + median(1, 3, 2) + "�Դϴ�.");		// [K] b��c��a
		System.out.println("�߾Ӱ��� " + median(2, 3, 3) + "�Դϴ�.");		// [L] b��c��a
		System.out.println("�߾Ӱ��� " + median(1, 2, 3) + "�Դϴ�.");	
	}

	static int median(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;		
	}
}
