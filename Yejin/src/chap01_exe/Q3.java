package chap01_exe;

public class Q3 {

	static int min4(int a, int b, int c, int d) {
		int min = a;
		min = (min < b)? min : b;
		min = (min < c)? min : c;
		min = (min < d)? min : d;
	return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("min4(2,6,3,8) = "+min4(2,6,3,8));
	}

}
