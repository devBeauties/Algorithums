package chap01Practice;

public class C1Q01 {
	public static void main(String[] args) {
		/*
		 * 연습문제 Q1
		 * 네 값의 최댓값을 구하는 max4 메서드를 작성하시오.
		 */
		
		System.out.println("max4(4,3,2,1) = " + max4(4, 3, 2, 1));		// [A] a＞b＞c
		System.out.println("max4(4,3,2,2) = " + max4(4, 3, 2, 2));		// [B] a＞b＝c
		System.out.println("max4(4,3,1,2) = " + max4(4, 3, 1, 2));		// [C] a＞c＞b
		System.out.println("max4(4,4,2,3) = " + max4(4, 4, 2, 3));		// [D] a＝c＞b
		System.out.println("max4(2,1,3,4) = " + max4(2, 1, 3, 4));		// [E] c＞a＞b
		System.out.println("max4(4,4,3,2) = " + max4(4, 4, 3, 2));		// [F] a＝b＞c
		System.out.println("max4(4,4,4,4) = " + max4(4, 4, 4, 4));		// [G] a＝b＝c
		System.out.println("max4(2,2,3,4) = " + max4(2, 2, 3, 4));		// [H] c＞a＝b
		System.out.println("max4(2,4,3,1) = " + max4(2, 4, 3, 1));		// [I] b＞a＞c
		System.out.println("max4(2,4,3,2) = " + max4(2, 4, 3, 2));		// [J] b＞a＝c
		System.out.println("max4(1,4,3,2) = " + max4(1, 4, 3, 2));		// [K] b＞c＞a
		System.out.println("max4(2,3,4,4) = " + max4(2, 3, 4, 4));		// [L] b＝c＞a
		System.out.println("max4(1,2,3,4) = " + max4(1, 2, 3, 4));	
	}
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;
	}
}
