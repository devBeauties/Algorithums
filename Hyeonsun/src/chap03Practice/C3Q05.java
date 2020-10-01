package chap03Practice;

import java.util.Scanner;

/*
 * 우리가 살펴본 이진 검색 알고리즘 프로그램은 검색할 값과 같은 값을 갖는 요소가 
 * 하나 이상일 경우 그 요소 중에서 맨 앞의 요소를 찾지 못합니다. 
 * 예를 들어 아래 그림의 배열에서 7을 검색하면 중앙에 위치하는 a[5]를 검색합니다.
 * 맨 앞의 요소를 찾는 binSearchX 메서드를 작성해보세요.
 * 
 * static int binSearchX(int[] a, int n, int key)
 */
public class C3Q05 {

	static int binSearchX(int[] a, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key) {
				for (; pc > pl; pc--) // key와 같은 맨 앞의 요소를 찾습니다
					if (a[pc - 1] < key)	// 나: key와 같은 값을 찾는데 key보다 작으면 안되니
						break;				// 나: if가 참일 때 break;
											// 나: if가 거짓일 때는 key와 동일한 값이기 때문에 pc > pl을 만족할 때까지 앞의 요소를 탐색한다 
				return pc; // 검색성공
			}else if(a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		}while (pl <= pr);
		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("x[0] : ");
		x[0] = sc.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "] : ");
				x[i] = sc.nextInt();
			}while(x[i] < x[i - 1]);	//바로 앞의 요소보다 작으면 다시 입력
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		int idx = binSearchX(x, num, key);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "은(는) x[" + idx + "]에 있습니다.");
	}
}
