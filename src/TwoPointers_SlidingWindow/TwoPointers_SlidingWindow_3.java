package TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoPointers_SlidingWindow_3 {
    public int solution(int n, int k, int[] arr){
        int answer=0, sum= 0;
        for(int i=0; i<k; i++) sum+=arr[i];
        answer=sum; //처음 세자리를 더한 값이니 answer는 sum으로 초기화
        for(int i=k; i<n; i++){ //여기서 부터 window 밀고 나간다.
            sum+=(arr[i]-arr[i-k]);
            answer=Math.max(answer, sum); //기존값과 sum중에서 큰값으로 교체해라라는 뜻

        }

        return answer;
    }

    public static void main(String[] args){
        TwoPointers_SlidingWindow_3 T = new TwoPointers_SlidingWindow_3();
        Scanner kb= new Scanner(System.in);
        int n = kb.nextInt(); //10일 매출 입력받을 값
        int k = kb.nextInt(); // 3일 최대 매출 입력 받을 값
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= kb.nextInt();
        }
        System.out.print(T.solution( n, k, arr));
    }
}
