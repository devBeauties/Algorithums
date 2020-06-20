package chap01_practice;
import java.util.Scanner;

/*
    실습 1C-1 (Median.java) 와 비교하여 효율이 떨어지는 이유?

    Median.java에서는 최적의 경우 2번, 최악의 경우 4번의 비교를 하게 된다.
    하지만 Q5의 경우 최적의 경우 4번의 비교와 3번의 논리 연산을 해야 하며
    최악의 경우 8번의 비교와 6번의 논리 연산 후에 값을 도출하게 된다.

    따라서 Median.java보다 Q5가 효율이 떨어진다.
*/

public class C01Q05 {
    static int med3(int a, int b, int c) {
        if((b >= a && c <= a) || (b <= a && c >= a))
            return a;
        else if((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.print("c의 값 : ");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}