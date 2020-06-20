package chap01;
import java.util.Scanner;

/* 
    실습 1-3
    입력한 정숫값이 양수/음수/0 인지 판단
*/

class JudgeSign {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int n = stdIn.nextInt();

        if (n > 0)
            System.out.println("이 수는 양수입니다.");
        else if (n < 0)
            System.out.println("이 수는 음수입니다.");
        else
            System.out.println("이 수는 0입니다.");
        
        if (n == 1)
            System.out.println("이 수는 1입니다.");
        else if (n == 2)
            System.out.println("이 수는 2입니다.");
        else if (n == 3)
            System.out.println("이 수는 3입니다.");
        else
            ; //공백문(실제로 아무것도 하지 않는 문장)
    }
}