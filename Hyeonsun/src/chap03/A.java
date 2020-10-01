package chap03;

public class A implements Comparable<A> {	//Comparable<A> 인터페이스 구

	// 필드, 메소드 등
	
	public int compareTo(A c) {	//compareTo 메서드 구현 
		/*
		 * this가 c보다크면 양의 값 반환
		 * this가 c보다 작으면 음의 값 반환
		 * this가 c와 같으면 0 반
		 */
		return 0;
	}
	
	public boolean equals(Object c) {	//equal 메서드 구현 
		/*
		 * this가 c와 같으면 true 반환
		 * this가 c와 같지 않으면 false 반환 
		 */
		return false;
	}
}
