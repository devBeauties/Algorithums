package chap01_Practice;

public class Q09 {
	static int sumof(int a, int b) {
		int first;
		int second;
		
		if(a < b) {
			first = a;
			second = b;
		} else {
			first = b;
			second = a;
		}
		
		int sum = 0;
		for (int i = first; i <= second; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("sumof(3, 5) : " + sumof(3, 5));
		System.out.println("sumof(6, 4) : " + sumof(6, 4));
	}
}
