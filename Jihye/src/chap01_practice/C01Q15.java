package chap01_practice;
import java.util.Scanner;

public class C01Q15 {
    //왼쪽 아래 직각
    static void triangleLB(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++)
                System.out.print('*');
            System.out.println();
        }
    }
    //왼쪽 위 직각
    static void triangleLU(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++)
                System.out.print('*');
            System.out.println();
        }
    }
    //오른쪽 위 직각
    static void triangleRU(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<i; j++)
                System.out.print(' ');
            for(int j=i; j<=n; j++)
                System.out.print('*');
            System.out.println();
        }
    }
    //오른쪽 아래 직각
    static void triangleRB(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++)
                System.out.print(' ');
            for(int j=1; j<=i; j++)
                System.out.print('*');
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("이등변 삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            n = stdIn.nextInt();
        } while(n <= 0);
        
        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
        
    }
}