package chap01Practice;

public class C1Q12 {
	public static void main(String[] args) {
		/*
		 * ��������Q12
		 * ���ʰ� ���ʿ� ���ϴ� ���� �ִ� ����ǥ�� ����Ͻÿ�.
		 * ���м��� ������ ��ȣ(|), ���̳ʽ� ��ȣ(-), �÷��� ��ȣ(+)�� ����Ͻÿ�.
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