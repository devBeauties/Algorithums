package chap01Practice;

public class C1Q03 {

	public static void main(String[] args) {
		/*
		 * �������� Q3
		 * �� ���� �ּڰ��� ���ϴ� min4�޼��带 �ۼ��Ͻÿ�.
		 */
		
		System.out.println("min4(4,3,2,1) = " + min4(4, 3, 2, 1));		
		System.out.println("min4(4,3,2,2) = " + min4(4, 3, 2, 2));		
		System.out.println("min4(4,3,1,2) = " + min4(4, 3, 1, 2));		
		System.out.println("min4(4,4,2,3) = " + min4(4, 4, 2, 3));		
		System.out.println("min4(2,1,3,4) = " + min4(2, 1, 3, 4));		
		System.out.println("min4(4,4,3,2) = " + min4(4, 4, 3, 2));		
		System.out.println("min4(4,4,4,4) = " + min4(4, 4, 4, 4));		
		System.out.println("min4(2,2,3,4) = " + min4(2, 2, 3, 4));		
		System.out.println("min4(2,4,3,1) = " + min4(2, 4, 3, 1));		
		System.out.println("min4(2,4,3,2) = " + min4(2, 4, 3, 2));		
		System.out.println("min4(1,4,3,2) = " + min4(1, 4, 3, 2));		
		System.out.println("min4(2,3,4,4) = " + min4(2, 3, 4, 4));		
		System.out.println("min4(1,2,3,4) = " + min4(1, 2, 3, 4));	
	}

	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		
		return min;
	}
}
