package chap02_practice;
import java.util.Scanner;

public class C02Q03 {
    static int sumOf(int[] a) {
        int sum = 0;
        for(int i=0; i<a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int num;
        Scanner stdIn = new Scanner(System.in);

        System.out.print("배열의 길이 입력 : ");
        num = stdIn.nextInt();
        int[] a = new int[num];

        for(int i=0; i<a.length; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }

        System.out.println("합 : " + sumOf(a));
    }
}