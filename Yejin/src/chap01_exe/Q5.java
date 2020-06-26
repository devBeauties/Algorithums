package chap01_exe;

public class Q5 {
	static int med3(int a, int b, int c) {
		if((b>=a&&c<=a)||(b<=a&&c>=a))
			return a;
		else if((a>b&&c<b)||(a<b&&c>b))
			return b;
		return c;
	}
	/*
	 * 해당 연산이 실습 1C-1의 med3연산보다 효율이 떨어지는 이유는
		1C-1은 깊이 우선탐색으로 한번 탐색시 차지하는 메모리가 적어 속도가 빠름에 비해
		해당 연산은 너비우선 탐색으로 한번에 메모리를 차지하는 데이터의 양이 많아 속도의 효율성이 떨어진다.
	*/
}
