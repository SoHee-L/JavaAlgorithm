package Array;

import java.util.ArrayList;
import java.util.Scanner;

class Array_1 {
    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]); //ArrayList를 추가하는건 .add() / 0번은 무조건 출력이니까 arr에 0번을 넣어줌
        for(int i=1; i<n; i++) { //arr[0]을 했으니 1번부터 시작
            if(arr[i]>arr[i-1]) answer.add(arr[i]); //arr에 i가 i-1보다 크면 arr에 i를 넣어줘라는 의미
        }
        return answer;
    }

    public static void main(String[] args){
        Array_1 T = new Array_1();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt(); //n을 받고
        int[] arr =new int[n]; //배열을 동적으로 n개를 잡음 /n크기의 동적배열을 만들고
        for(int i=0; i<n; i++){ //for문이 돌면서
            arr[i] = kb.nextInt(); //arr[i]에다가 하나씩 계속 넣는다. 그럼 배열에 7 3 9 5 6 12가들어가게된다.
        }
        for(int x : T.solution(n,arr)){
            System.out.print(x+" ");
        }
    }
}
