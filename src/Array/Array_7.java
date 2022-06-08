package Array;

import java.util.Scanner;

class Array_7 {
    public int solution(int n, int[] arr){ //n은 10이고 arr은 1011~등이 10개가 들어감
        int answer= 0, cnt=0; //answer를 리턴할 것이니 sum이아닌 answer에 누적한다.
        for(int i=0; i<n; i++){
            if(arr[i]==1){ //arr에 i가 1이면 cnt가 증가하고 그증가한 cnt를 answer에 누적해라라는 의미.
                cnt++;
                answer+=cnt;
            }
            else cnt=0; //그렇지 않다면 cnt를 0으로 초기화 해라
        }
        return answer;
    }
    public static void main(String[] args){
        Array_7 T = new Array_7();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt(); // arr이 10을 배열로 받아서 1011~~로 되어있으면

        }
        System.out.print(T.solution(n, arr));
    }

}
