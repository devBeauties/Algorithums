package chap02_practice;
import java.util.Scanner;

/* 
    실습 2-6
    배열 요소에 값을 읽어 들여 역순으로 정렬
*/

public class C02Q02 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
        System.out.println("a[" + idx1 + "]과 a[" + idx2 + "]를 교환합니다.");
        for(int i=0; i<a.length; i++)
            System.out.print(a[i] + " ");
            System.out.println();
    }

    static void reverse(int[] a) {
        for(int i=0; i<a.length /2; i++) {
            swap(a, i, a.length-i-1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i=0; i<num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬 끝");
        for(int i=0; i<num; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}