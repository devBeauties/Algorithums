package chap01_practice;
import java.util.Scanner;

public class C01Q17 {
    static void npria(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) //공백 출력 (3, 2, 1...)
                System.out.print(' ');
            for(int j=1; j<=(i-1)*2+1; j++) { //숫자 출력 (1, 3, 5...)
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("삼각형을 출력합니다.");

        do {
            System.out.print("몇 단 삼각형입니까? : ");
            n = stdIn.nextInt();
        } while(n <= 0);

        npria(n);
        
    }
}