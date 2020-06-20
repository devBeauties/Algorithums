package chap01_practice;
import java.util.Scanner;

public class C01Q03 {
    static int min4(int a, int b, int c, int d) {
        int min = a;

        if(min > b)
            min = b;
        if(min > c)
            min = c;
        if(min > d)
            min = d;
        
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최솟값을 구합니다.");
        System.out.print("a : ");
        int a = sc.nextInt();
        System.out.print("b : ");
        int b = sc.nextInt();
        System.out.print("c : ");
        int c = sc.nextInt();
        System.out.print("d : ");
        int d = sc.nextInt();

        System.out.println("최솟값 : " + min4(a, b, c, d));
    }
}