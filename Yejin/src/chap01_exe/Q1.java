package chap01_exe;

public class Q1 {

	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		max = (max > b)? max : b;
		max = (max > c)? max : c;
		max = (max > d)? max : d;
		return max;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("max4(2,4,1,9) = "+max4(2,4,1,9));
	}

}
