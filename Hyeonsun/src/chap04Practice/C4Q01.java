package chap04Practice;

import java.util.Scanner;

import chap04.IntStack;

public class C4Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println();
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)인덱스 (6)비움");
			System.out.println("(7)용량 (8)데이터 수 (9)비어있는가? (10)가득차있는가?");
			System.out.print("(0)종료 : ");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터: ");
				x = sc.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
			break;
			
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
			break;
			
			case 3:
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
			break;
			
			case 4:
				s.dump();
			break;
			// indexOf, clear, capacity, size, isEmpty, isFull
			case 5:
				try {
					System.out.print("찾을 데이터: ");
					int param = sc.nextInt();
					x = s.indexOf(param);
					System.out.println("찾은 데이터의 인덱스는 " + x + "입니다.");
				} catch (Exception e) {
					System.out.println("인덱스를 찾을 수 없습니다.");
				}
			break;
			
			case 6:
				try {
					s.clear();
					System.out.println("스택을 비웠습니다.");
				} catch (Exception e) {
					System.out.println("스택을 비우지 못했습니다.");
				}
			break;
			
			case 7:
				try {
					x = s.capacity();
					System.out.println("스택의 용량은 " + x + "입니다.");
				} catch (Exception e) {
					System.out.println("스택의 용량을 확인하지 못했습니다.");
				}
			break;
			
			case 8:
				try {
					x = s.size();
					System.out.println("스택의 데이터 수는 " + x + "입니다.");
				} catch (Exception e) {
					System.out.println("스택의 데이터 수를 확인하지 못했습니다.");
				}
			break;
			
			case 9:
				try {
					boolean result = s.isEmpty();
					if(result) {
						System.out.println("스택은 비어있습니다.");						
					}else {
						System.out.println("스택은 비어있지 습니다.");						
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			break;
			
			case 10:
				try {
					boolean result = s.isFull();
					if(result) {
						System.out.println("스택은 가득 차있습니다.");						
					}else {
						System.out.println("스택은 가득 차있지않습니다.");						
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			break;
			}	//end: switch
		}	//end: while

	}

}
