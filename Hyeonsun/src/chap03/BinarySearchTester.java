package chap03;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 기본 자료형 배열에서 binarySearch 메서드로 검색하
 * binarySearch 메서드는 int형이나 long형과 같은 기본 자료형 배열에서 이진 검색을 하는 메서드이다.
 */
public class BinarySearchTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");	//배열의 첫 요소를 먼저 입력
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i-1]);	//바로 앞의 요소보다 작으면 다시 입력한다.
		}
		
		System.out.println("검색할 값 : ")	; 	//키 값을 입력 받음 
		int ky = sc.nextInt();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0) {
			System.out.println("그 값의 요소가 없습니다.");
		}else {
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		}
	}
}
