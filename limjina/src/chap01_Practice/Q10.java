package chap01_Practice;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int result;
		
		System.out.print("a�� �� : ");
		a = scan.nextInt();
		
		do {
			System.out.print("b�� �� : ");
			b = scan.nextInt();
			if (b <= a) {
				System.out.println("a���� ū ���� �Է��ϼ���!");
			}
		} while (b <= a);
		
		result = b - a;
		System.out.println("b - a�� " + result + "�Դϴ�.");
		
		scan.close();
	}
}
