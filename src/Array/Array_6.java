package Array;

import java.util.ArrayList;
import java.util.Scanner;

class Array_6 {
    public boolean isPrime(int num){ //소수인지 확인하는 함수 참, 거짓으로
        if(num==1) return false;
        for(int i=2; i<num; i++){ //2부터 자기 자신까지 확인해서
            if(num%i==0) return false; //약수가 발견되면 소수가 아니라는 의미.
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp=arr[i]; //tmp를 뒤집을때
            int res=0;
            while (tmp>0){ //tmp가 0보다 클때만이라고 정해줘야지 123을 뒤집을 때 3210이 아닌 321이 나온다.
                int t=tmp%10;
                res=res*10+t;
                tmp=tmp/10;
            }
            if(isPrime(res)) answer.add(res); //res를 뒤집은 결과가 소수인지 확인. res가 참이면 출력.
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
