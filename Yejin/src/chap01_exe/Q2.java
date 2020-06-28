package chap01_exe;

public class Q2 {

	static int min3(int a, int b, int c) {
		int min = a;
		min = (min < b)? min : b;
		min = (min < c)? min : c;
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("min3(1,3,6) = "+min3(1,3,6));
	}

}
