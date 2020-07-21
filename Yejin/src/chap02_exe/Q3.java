package chap02_exe;
import java.util.Scanner;

public class Q3 {
	static int sum = 0;
	static int sumOf(int[] a) {
		for(int i = 0; i < a.length; i++) {
			sum +=  a[i];
		}
		System.out.println("배열 a의 모든 요소의 합계는 : "+sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int x = sc.nextInt();
		
		int[] a = new int[x];
		for(int i = 0; i < a.length; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextInt();
		}
		sumOf(a);
	}

}
