package chap01.practice;

public class C1Q12 {
	public static void main(String[] args) {
		/*
		 * 연습문제Q12
		 * 위쪽과 왼쪽에 곱하는 수가 있는 곱셈표를 출력하시오.
		 * 구분선은 수직선 기호(|), 마이너스 기호(-), 플러스 기호(+)를 사용하시오.
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
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}	
	}
}
