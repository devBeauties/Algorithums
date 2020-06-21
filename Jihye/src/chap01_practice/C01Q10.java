package chap01_practice;
import java.util.Scanner;

public class C01Q10 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b;
        System.out.println("a부터 b까지의 합을 구합니다.");
        System.out.print("a의 값 : ");
        a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        b = stdIn.nextInt();
        
        while (b <= a){
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b의 값 : ");
            b = stdIn.nextInt();
        }

        System.out.println("b-a 는 " + (b-a) + " 입니다.");
    }
}