package chap01_exe;
import java.util.Scanner;

public class Q9 {
	
	static int sumof(int a, int b) {
		
		int result = 0;
		for(int i = a; i <= b; i++) {
			result += i;
		}
		System.out.println("a와 b 사이의 모든 정수 값의 합은 : "+result);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a의 값은 : ");
		int x = stdIn.nextInt();
		System.out.print("b의 값은 : ");
		int y = stdIn.nextInt();
		
		sumof(x,y);
	}

}
