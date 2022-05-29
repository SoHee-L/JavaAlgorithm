package Array;

import java.util.Scanner;

class Array_5 {
    public int solution(int n){
        int answer = 0; //answer로 카운팅
        int[] ch=new int[n+1]; // check할 배열 / n+1해줘야 n번 index까지 생긴다. 0부터 시작하니
        for(int i=2; i<=n; i++  ){
            if(ch[i]==0){ //ch[i]가 0이면 소수라는 얘기니까 카운팅해준다.
                answer++;
                for(int j=i; j<=n; j=j+i){ //나머지 소수가 아닌것들 j는 i의 배수로 돌아야되니 j+i(i씩 증가해야되니끼)
                    ch[j]=1;
                }

            }
        }
        return answer;
    }
    public static void main(String[] args){
        Array_5 T = new Array_5();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        System.out.println(T.solution(n));
    }
}
