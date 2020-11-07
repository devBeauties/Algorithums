package chap04Practice;

import java.lang.reflect.Array;

import chap04.IntQueue.EmptyIntQueueException;
import chap04.IntQueue.OverflowIntQueueException;

/*
 * 임의의 객체형 데이터를 쌓아 놓을 수 있는 제네릭 큐 클래스 Gqueue<E>를 작성하세요.
 * 
 * 참고 링크
 * https://yaboong.github.io/java/2019/01/19/java-generics-1/
 * 
 */
public class C4Q06<E> {

	private int max; // 큐의 용량
	private int num; // 현재 데이터 수
	private int front; // 프런트 요소 커서
	private int rear; // 리어 요소 커서
	private E[] que; // 큐의 본

	// 실행 시 예외: 큐가 비어 있음
	public static class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// 실행 시 예외: 큐가 가득 참
	public static class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	// 생성자
	public C4Q06(Class<E> clazz, int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = (E[]) Array.newInstance(clazz, max); // 큐 본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없음
			max = 0;
		}
	}
	// https://bit.ly/36aBswk

	// 큐에 데이터를 인큐
	public E enque(E x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException(); // 큐가 가득 참
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	// 큐에서 데이터를 디큐
	public E deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		E x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	// 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public E peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}

	// 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public int indexOf(E x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x)
				return idx;
		}
		return -1;
	}

	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}

	// 큐가 비어 있나요?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어 있습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
}
