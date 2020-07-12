package chap02Practice;

import java.util.Scanner;

/*
 * y년 m월 d일의 그 해 남은 일 수 (12월 31일이면 9, 12월 30일이면 1)를 구하는 아래 메서드를 작성하세요.
 * static int leftDayOfYear(int y, int m, int d)
 */
public class C2Q9 {
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	//평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	//윤년
	};
	
	static int isLeap(int year) {	//1 : 윤년 / 0: 평년
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;	
	}

	static int leftDayOfYear(int y, int m, int d) {
		while(--m != 0) {
			d += mdays[isLeap(y)][m-1];
			System.out.println(m);
		}	
		
		if(isLeap(y) == 0) {		// 0 : 평년, 365
			d = 365 - d;
		}else {
			d = 366 - d;
		}
		
		return d;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 경과 일수를 구합니다.");
		
		do {
			System.out.print("년 : "); int year = sc.nextInt();
			System.out.print("월 : "); int month = sc.nextInt();
			System.out.print("일 : "); int day = sc.nextInt();
			
			System.out.printf("그 해 %d일 남았습니다.\n", leftDayOfYear(year, month, day));
			
			System.out.print("한 번 더 할까요? 1.예 / 0.아니오 : ");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
