package Array;

import java.util.ArrayList;
import java.util.Scanner;

class Array_6 {
    public boolean isPrime(int num){ //소수인지 확인하는 함수 참, 거짓으로

    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp=arr[i]; //tmp를 뒤집을때
        }


        return answer;
    }
    public static void main(String[] args){
        Array_6 T = new Array_6();
        Scanner kb = new Scanner(System.in);
        int n= kb.nextInt();
        int[] arr=new int[n]; // 길이 배열을 받음 솔루션에 넘기려고
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt(); //for문 돌면서 n개 숫자를 받는다.
        }
        for(int x :T.solution(n, arr)){ //n= 개수를 넘기고 arr에 자연수를 받음
            System.out.print(x+" ");
        }
    }

}
