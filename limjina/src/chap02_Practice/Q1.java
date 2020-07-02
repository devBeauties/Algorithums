package chap02_Practice;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int num = rand.nextInt(10);
		System.out.print("사람 수 : " + num + "\n");
		
		int[] height = new int[num];
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i] + "입니다.");
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		
		scan.close();
	}
}
