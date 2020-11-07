package chap04Practice;

import java.util.Scanner;

import chap04.IntStack;

public class IntQueueTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C4Q05 s = new C4Q05(64);	
		C4Q07 j = new C4Q07(12);
		
		//연습문제 5번
		int[] num = {35, 56, 24, 68, 95, 73, 19};
		
		for(int i = 0; i < num.length; i++) {
			s.enque(num[i]);
		}
		/*
		 s.dump();
		
		System.out.println(s.search(35));
		System.out.println(s.search(99));
		
		
		for(int i = 0; i < num.length; i++) {
			j.enqueBack(num[i]);
		}
		
		j.dump();*/
		
		while(true) {
			System.out.println("현재 데이터 수 : " + j.size() + "/" + j.capacity());
			System.out.print("(1)맨 끝 인큐 (2)맨 앞 인큐 (3)맨 뒤 디큐 (4)맨 앞 디큐 (5)덤프 (0)종료 : ");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("맨 끝 인큐: ");
				x = sc.nextInt();
				try {
					j.enqueBack(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
			break;
			
			case 2:
				System.out.print("맨 앞 인큐: ");
				x = sc.nextInt();
				try {
					j.enqueFront(x);
				}catch(IntStack.OverflowIntStackException e) {
					System.out.println("큐가 가득 찼습니다.");
				}
			break;
			
			case 3:
				try {
					x = j.dequeBack();
					System.out.println("맨 뒤 디큐 " + x + "입니다.");
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("큐가 비어 있습니다.");
				}
			break;
			
			case 4:
				try {
					x = j.dequeFront();
					System.out.println("맨 앞 디큐 " + x + "입니다.");
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("큐가 비어 있습니다.");
				}
				
			case 5:
				j.dump();
				break;
			}
			
		}
	}
}
