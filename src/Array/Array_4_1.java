package Array;

import java.util.Scanner;

class Array_4_1 {
    public void solution(int n){
        //배열을 쓰지 않고 손코딩하는 경우
        int a=1, b=1, c;
        System.out.print(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args){
        Array_4_1 T = new Array_4_1();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        T.solution(n); //return같은것 없고 호출임
    }
}
