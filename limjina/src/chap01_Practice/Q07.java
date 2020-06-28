package chap01_Practice;

import java.util.Scanner;

public class Q07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("nÀÇ °ª : ");
		int n = scan.nextInt();
		
		int sum = 0;
		String str = "";
		for (int i = 1; i <= n; i++) {
			sum += i;
			
			if (i == n) {
				str += i + " = ";
			} else {
				str += i + " + ";
			}
		}
		
		System.out.println(str + sum);
		
		scan.close();
	}
}
