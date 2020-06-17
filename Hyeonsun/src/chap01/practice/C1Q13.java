package chap01.practice;

public class C1Q13 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q13
		 * Q12에서 곱셈이 아니라 덧셈을 출력하는 프로그램을 작성하시오
		 */
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 10; j++) {
				if(i == 0) {
					if(j == 0) {
						System.out.print("    |");
					}else {
						System.out.printf("%3d", j);				
					}
				}else {
					if(j == 0) {
						System.out.println();
						System.out.print("---+");
					}else {
						System.out.print("---");				
					}
				}
			}
		}
		System.out.println();
		for(int i = 1; i <= 9; i++) {
			System.out.print(" " +  i + " |");
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}	
	}
}
