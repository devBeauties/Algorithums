package chap01_Practice;

import java.util.Scanner;

public class Q14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� �� : ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
