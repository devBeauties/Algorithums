package chap01_practice;
import java.util.Scanner;

public class C01Q06 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0; //합
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("while문 종료 시 i값은 " + i + "입니다.");
    }
}