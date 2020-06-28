package chap01_exe;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;

		System.out.println("1부터 n까지의 합을 구하시오.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.print(i);
			sum += i;
			if(i!=n)
				System.out.print("+");
		}
		System.out.println("="+sum);
	}

}
