package chap01_practice;
import java.util.Scanner;

public class C01Q11 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("양의 정수 n의 자릿수를 구합니다.");
        int n;

        do{
            System.out.print("n의 값 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        String str = "" + n;
        
        System.out.println("그 수는 " + str.length() + "자리 입니다.");
    }
    
}