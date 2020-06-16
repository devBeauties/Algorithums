package chap01.practice;

public class C1Q4 {

	public static void main(String[] args) {
		/*
		 * 연습문제 Q4
		 * 세 값의 대소 관계 13종류의 모든 조합에 대해 중앙값을 구하여 출력하라.
		 */

		System.out.println("중앙값은 " + median(3, 2, 1) + "입니다.");		// [A] a＞b＞c
		System.out.println("중앙값은 " + median(3, 2, 2) + "입니다.");		// [B] a＞b＝c
		System.out.println("중앙값은 " + median(3, 1, 2) + "입니다.");		// [C] a＞c＞b
		System.out.println("중앙값은 " + median(3, 2, 3) + "입니다.");		// [D] a＝c＞b
		System.out.println("중앙값은 " + median(2, 1, 3) + "입니다.");		// [E] c＞a＞b
		System.out.println("중앙값은 " + median(3, 3, 2) + "입니다.");		// [F] a＝b＞c
		System.out.println("중앙값은 " + median(3, 3, 3) + "입니다.");		// [G] a＝b＝c
		System.out.println("중앙값은 " + median(2, 2, 3) + "입니다.");		// [H] c＞a＝b
		System.out.println("중앙값은 " + median(2, 3, 1) + "입니다.");		// [I] b＞a＞c
		System.out.println("중앙값은 " + median(2, 3, 2) + "입니다.");		// [J] b＞a＝c
		System.out.println("중앙값은 " + median(1, 3, 2) + "입니다.");		// [K] b＞c＞a
		System.out.println("중앙값은 " + median(2, 3, 3) + "입니다.");		// [L] b＝c＞a
		System.out.println("중앙값은 " + median(1, 2, 3) + "입니다.");	
	}

	static int median(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;		
	}
}
