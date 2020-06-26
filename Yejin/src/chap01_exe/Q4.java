package chap01_exe;
import java.util.Scanner;

public class Q4 {

	static int Median(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if(c>= a)
				return a;
			else
				return c;
		else
			if(a>=c)
				return a;
			else if(b>=c)
				return c;
			else
				return b;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		int repeat = 0;
		while(repeat < 13) {
		System.out.println("세 숫자를 입력하시오 = ");
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		System.out.println("세 숫자의 중앙값은 = "+Median(a,b,c));
		repeat++;
		}
	}

}
