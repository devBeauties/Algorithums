package chap04Practice;


/*
 * 덱(deck)이라는 양방향 대기열은 시작과 끝 지점에서 양쪽으로 데이터를 
 * 인큐하거나 디큐하는 자료구조이다. 양방향 대기열을 구현하는 클래스 IntDeque를 만드세요.
 * 덱에 저장하는 데이터 자료형은 int형으로 한다.
 */
public class C4Q07 {
	private int max;	//큐의 용량 
	private int front;	//첫 번째 요소 커서 
	private int rear;	//마지막 요소 커서 
	private int num;	//현재 데이터 수 
	private int[] que;	//큐 본체 
	
	//실행 시 예외: 큐가 비어 있음 
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {}
	}
	//실행 시 예외: 큐가 가득 참 
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {}
	}
	
	//생성자 
	public C4Q07(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];			//큐 본체용 배열을 생성 
		}catch(OutOfMemoryError e) {	//생성할 수 없음 
			max = 0;
		}
	}
	
	//데이터를 맨 끝에 인큐 
	public int enqueBack(int x) throws OverflowIntQueueException{
		if(num >= max)
			throw new OverflowIntQueueException();	//큐가 가득 참
		que[rear++] = x;
		num++;
		if(rear == max)
			rear = 0;
		return x;
	}

	//데이터를 맨 앞에 인큐 
	public int enqueFront(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException(); // 큐가 가득 참
		que[front--] = x;
		num++;
		if (front == max)
			front = 0;
		return x;
	}
	
	//데이터를 맨 뒤에서 디큐 
	public int dequeBack() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		int x = que[--rear];
		num--;
		if(rear == max)
			rear = 0;
		return x;
	}
	
	//데이터를 맨 앞에서 디큐 
	public int dequeFront() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if(front == max)
			front = 0;
		return x;
	}
	
	//큐에서 데이터를 피크(프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException{
		if(num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}
	
	//큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환 
	public int indexOf(int x) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == x)
				return idx;
		}
		return -1;
	}
	
	//큐를 비움 
	public void clear() {
		num = front = rear = 0;
	}
	
	//큐의 용량을 반환 
	public int capacity() {
		return max;
	}
	
	//큐에 쌓여 있는 데이터 수를 반환
	public int size() {
		return num;
	}
	
	//큐가 비어 있나요? 
	public boolean isEmpty() {
		return num <= 0;
	}
	
	//큐가 가득 찼나요?
	public boolean isFull() {
		return num >= max;
	}
	
	//큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력 
	public void dump() {
		if(num <= 0) 
			System.out.println("큐가 비어 있습니다.");
		else {
			for(int i = 0; i < num; i++) 
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
}
