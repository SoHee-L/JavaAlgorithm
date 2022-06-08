package Array;

import java.util.Scanner;

class Array_9 {
    public int solution(int n, int[][] arr){
        int answer = Integer.MIN_VALUE; //answer은 행과 열, 두대각선합중 가장 큰값이 저장될 예정이니 가장 작은정수로 초기화해줌.
        int sum1, sum2; //행과 열합을 각각 구해서 answer보다 크면 바꿔준다. sum1은 행의 합 sum2열의 합
        for(int i=0; i<n; i++){
            sum1=sum2=0; //여기서 초기화해도됨.
            for(int j=0; j<n; j++){
                sum1+=arr[i][j]; //sum1일때 i가 0일 때 j가 ++하면서 돈다. 행이고 고정되고 열이 움직인다는 의미
                sum2+=arr[j][i]; //이렇게 하면 행이 sum1에 다 누적되고 열이 sum2에 다 누적된다.
            }
            answer=Math.max(answer, sum1); //둘중에 큰값으로 갱신함.
            answer=Math.max(answer, sum2);

        }
        sum1=sum2=0;
        for(int i=0; i<n; i++){ //대각선 2개의 것만 한번 구하면되니까 여긴 for문 하나만 돌면된다.
            sum1+=arr[i][i]; //대각선 1은 행과열이 같고 반대 대각선은 n-i-1을 해줘야 구할 수 있다.
            sum2+=arr[i][n-i-1];

        }
        answer=Math.max(answer, sum1); //둘중에 큰값으로 갱신함.
        answer=Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args){
        Array_9 T = new Array_9();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int[][] arr= new int[n][n]; // 2차원 배열 nxn
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j]= kb.nextInt();
            }
        }
        System.out.print(T.solution(n,arr));
    }
}
