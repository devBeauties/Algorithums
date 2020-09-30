package chap03Practice;

import java.util.Scanner;

/*
 실습 3-3의 seqSearchSen 메서드를 while문이 아니라 fo문을 사용하여 수정한 프로그램 작성하세요.
 */
public class C3Q01 {

	static int seqSearchSen(int[] a, int n, int key) {
		int i;
		a[n] = key;
		
//		for(i = 0; i < n; i++)
//		{
//			if(a[i] == key)
//				break;
//		}
		
		//solution
		for (i = 0; a[i] != key; i++)
			;

		return i == n ? -1 : i;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("선형검색 - 보초법");
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		int idx = seqSearchSen(x, num, key);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
	}
}
