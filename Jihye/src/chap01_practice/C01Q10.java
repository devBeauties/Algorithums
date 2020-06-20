package chap01_practice;
import java.util.Scanner;

public class C01Q10 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b;
        System.out.println("a부터 b까지의 합을 구합니다.");
        do{
            System.out.print("a의 값 : ");
            a = stdIn.nextInt();
            System.out.print("b의 값 : ");
            b = stdIn.nextInt();
        } while (b < a);

        System.out.println("합은 " + (b-a) + " 입니다.");
    }
}