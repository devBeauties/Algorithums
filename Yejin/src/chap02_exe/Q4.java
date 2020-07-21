package chap02_exe;
import java.util.Scanner;

public class Q4 {

	static void copy(int[] a, int[] b) {
		b = a.clone();
		for(int i = 0; i < b.length; i++) {
			System.out.println("b["+i+"] : " +b[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 a의 요솟수 : ");
		int num1 = sc.nextInt();
		int[] a = new int[num1];
		int[] b = new int[num1];
		for(int i = 0; i < num1; i++) {
			System.out.print("a["+i+"] : ");
			int num2 = sc.nextInt();
			a[i] = num2;
		}
		copy(a, b);
	}

	
}
