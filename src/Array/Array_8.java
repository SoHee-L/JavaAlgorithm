package Array;

import java.util.Scanner;

class Array_8 {
    public int[] solution(int n,int[] arr){
        int[] answer = new int[n]; //0으로 초기화 되어있음.
        for(int i=0; i<n; i++){
            int cnt=1; //cnt는 항상 처음엔 1이다 i의 등수는 처음에 1등이기 때문
            for(int j=0; j<n; j++){
                if(arr[j]>arr[i]) cnt++; //j라는 점수가 i라는 점수보다 크면 등수를 증가시킴
            }
            answer[i]=cnt; // 이렇게 다돌면 i의 등수가 구해지니. i에 cnt를 넣어주면 된다.
        }

        return answer;
    }

    public static void main(String[] args){
        Array_8 T = new Array_8();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for(int x:T.solution(n,arr)) System.out.print(x+" ");
    }
}
