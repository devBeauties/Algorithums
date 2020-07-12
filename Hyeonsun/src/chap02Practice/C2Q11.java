package chap02Practice;

import java.util.Scanner;

/*
 * 오른쪽처럼 서기 년월일을 필드로 갖는 클래스를 만드세요. 
 * 다음과 같이 생성자와 메서드를 정의해야 합니다.
 * 
 * 생성자(주어진 날짜로 설정)
 * YMD(int y, int m int d)
 * 
 * n일 뒤의 날짜를 반환
 * YMD ater(int n)
 * 
 * n일 앞의 날짜를 반환
 * YMD before(int n)
 */
public class C2Q11 {
	private int y;
	private int m;
	private int d;
	
	public C2Q11(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	C2Q11 after(int n) {
//		n += n;
		C2Q11 temp = new C2Q11(this.y, this.m, this.d); 
		if (n < 0)
			return (before(-n));

		temp.d += n;

		while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
			if (++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		return temp;
	}
	
	C2Q11 before(int n) {
//		n -= n;
		C2Q11 temp = new C2Q11(this.y, this.m, this.d);
		if (n < 0)
			return (after(-n));

		temp.d -= n;

		while (temp.d < 1) {
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m - 1];
		}
		return temp;
	}
	
	static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	//평년
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}	//윤년
	};
	
	static int isLeap(int year) {	//1 : 윤년 / 0: 평년
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;	
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int retry;
		
		System.out.print("날짜를 입력하세요.\n");
		
		do {
			System.out.print("년 : "); int year = sc.nextInt();
			System.out.print("월 : "); int month = sc.nextInt();
			System.out.print("일 : "); int day = sc.nextInt();
			
			C2Q11 today = new C2Q11(year, month, day);
			
			System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
			int n = sc.nextInt();
			
			C2Q11 d1 = today.after(n);
			System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일입니다.\n", n, d1.y, d1.m, d1.d);
			
			C2Q11 d2 = today.before(n);
			System.out.printf("%d일 앞의 날짜는 %d년 %d월 %d일입니다.\n", n, d2.y, d2.m, d2.d);
			
			System.out.print("한 번 더 할까요? 1.예 / 0.아니오 : ");
			retry = sc.nextInt();
		}while(retry == 1);
	}
}
