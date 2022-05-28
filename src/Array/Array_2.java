package Array;

import java.util.Scanner;

class Array_2 {
    public int solution(int n, int[] arr){
        int answer=1, max=arr[0]; //첫번째사람은 무조건 보이니까 1/ max도 첫번째사람이니까 0
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                answer++;
                max=arr[i];
            }
        }
            return answer;


    }
    public static void main(String[] args){
        Array_2 T = new Array_2();
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        System.out.print(T.solution(n,arr));
    }
}
