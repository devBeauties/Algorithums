package chap01_practice;
import java.util.Scanner;

public class C01Q07 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n의 값 : ");
        int n = stdIn.nextInt();

        int sum = 0; //합
        String str = "";
        
        for(int i=1; i<=n; i++) {
            sum += i;
            if(i == n){
                str += i;
                str += " = ";
            
            }
            else {
                str += i;
                str += " + ";
            }

        }

        System.out.println(str + sum + " 입니다.");
    }
}