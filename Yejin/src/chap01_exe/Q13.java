package chap01_exe;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("  |");
		for(int k = 1; k <=9; k++)
			System.out.print(k);
		System.out.println();
		System.out.println("--+-----------------------");
		for(int i = 1; i <= 9; i++) {
			System.out.print(i+"|");
			for(int j = 1; j<=9; j++) {
				System.out.print(i+j);
			}
			System.out.println();
		}
	}

}
