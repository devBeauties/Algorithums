package chap01;

/* 
    실습 1-2
    3개의 정숫값을 입력하고 최댓값 구하기
*/

public class Max3m {
    static int max3(int a, int b, int c) {
        int max = a;
        if(b > max)
            max = b;
        if(c > max)
            max = c;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3, 2, 1)); //[A] a>b>c
        System.out.println("max3(3,2,1) = " + max3(3, 2, 2)); //[B] a>b=c
        System.out.println("max3(3,2,1) = " + max3(3, 1, 2)); //[C] a>c>b
        System.out.println("max3(3,2,1) = " + max3(3, 2, 3)); //[D] a=c>b
        System.out.println("max3(3,2,1) = " + max3(2, 1, 3)); //[E] c>a>b
        System.out.println("max3(3,2,1) = " + max3(3, 3, 2)); //[F] a=b>c
        System.out.println("max3(3,2,1) = " + max3(3, 3, 3)); //[G] a=b=c
        System.out.println("max3(3,2,1) = " + max3(2, 2, 3)); //[H] c>a=b
        System.out.println("max3(3,2,1) = " + max3(2, 3, 1)); //[I] b>a>c
        System.out.println("max3(3,2,1) = " + max3(2, 3, 2)); //[J] b>a=c
        System.out.println("max3(3,2,1) = " + max3(1, 3, 2)); //[K] b>c>a
        System.out.println("max3(3,2,1) = " + max3(2, 3, 3)); //[L] b=c>a
        System.out.println("max3(3,2,1) = " + max3(1, 2, 3)); //[M] c>b>a
    }
}