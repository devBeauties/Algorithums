package chap01Practice;

import java.util.Scanner;

public class C1Q05 {
	public static void main(String[] args) {
		/*
		 * 연습문제 Q5
		 * 중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있다. 
		 * 그러나 Median.java의 med3()보다 효울이 떨어지는데 그 이유를 설명하세요.
		 */
		
		/* 
		 * Median.java의 med3()에서는 if(a >= b)에서 분기된 경우의 수에 반대되는 분기를 if(a >= b)의 else if로 두고 있다.
		 * 하지만 연습문제의 med3()에서는 만족해야 할 값과 검해야 할 경우의 수가 많아진다.
		 * 
		 * 해답
		 * 가장 처음의 if문의 판단
		 * 	if ((b >= a && c<= a) || (b <= a && c >= a))
		 * 	에 주목합니다. 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의
		 * 	else if ((a > b && c < b) || (b <= a && c > b))
		 * 	으로 수행합니다. 결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.
		 */
	}
	
	static int med3 (int a, int b, int c) {
		if((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if((a > b && c < b) || ( a < b && c > b))
			return b;
		return c;
	}
}
