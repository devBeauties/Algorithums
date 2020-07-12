package chap02Practice;

import java.util.Scanner;

/*
 * 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요.(70p)
 */
public class C2Q07 {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "01234566789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char result;
		
		System.out.println(r + " |       " + x);
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
			
			System.out.println("  + --------");
			if(x != 0) {
				System.out.println(r + " |       " + x + " ''' " + d[digits-1]);				
			}
		}while(x != 0);
		System.out.println("          " + x + " ''' " + d[digits-1]);			
		
		// 아랫자리 윗자리 교환
		for(int i = 0; i < digits / 2; i++) {
			char first = d[i];
			d[i] = d[digits - 1 - i];
			d[digits - 1 - i] = first;
		}
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;								// 변환하는 정수
		int cd;								// 기수
		int dno;								// 변환 후의 자릿수
		int retry;								// 다시 한 번?
		char[] cno = new char[32];		// 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = sc.nextInt();
			}while(no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = sc.nextInt();
			}while(cd < 2 || cd > 36);
			
			dno = cardConv(no, cd, cno);
			
			System.out.print(cd + "진수로는 ");
			for(int i = 0; i <  dno; i++) {
				System.out.print(cno[i]);
			}
			System.out.println("입니다.");
			
			System.out.print("한번 더 할까요? (1.예 / 0.아니오) : ");
			retry = sc.nextInt();
		}while(retry == 1);

	}
}
