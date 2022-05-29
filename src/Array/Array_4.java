package Array;

import java.util.Scanner;

class Array_4 {
    public int[] solution(int n){
        int[] answer=new int[n];
        answer[0]=1; //피보나치 수열은 1 1로시작하니까 index 0,1은 고정으로 놓는다.
        answer[1]=1;
        for(int i=2; i<n; i++){
            answer[i]=answer[i-2]+answer[i-1]; //i의 앞에 앞에는 i-2이고 i의 바로 앞에는 앞에는 i-1이다.
        }

        return answer;
    }
    public static void main(String[] args){
        Array_4 T = new Array_4();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        for(int x:T.solution(n)) System.out.print(x+" ");
    }
}
