package chap02_practice;
import java.util.Scanner;

public class C02Q05 {
    static void copy(int[] a, int[] b) {
        for(int i=0; i<a.length; i++) {
            b[i] = a[a.length-i-1];
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a 배열의 길이 입력 : ");
        num = stdIn.nextInt();
        int[] a = new int[num];

        for(int i=0; i<a.length; i++) {
            System.out.print("a[" + i + "] : ");
            a[i] = stdIn.nextInt();
        }
        
        int[] b = new int[num];
        copy(a, b);

        for(int i=0; i<b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }
    }
}