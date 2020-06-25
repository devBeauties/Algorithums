package chap01_exe;
import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		System.out.print("양의 정수를 입력하시오 : ");
		int n = stdIn.nextInt();
		int i = 0;
		while(n > 0) {
			n = n / 10;
			i++;
		}
		System.out.println("그 수는 "+i+"자리 입니다.");
	}

}
