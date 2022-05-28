package Array;

import java.util.Scanner;

class Array_3 {
    public String solution(int n, int[] a, int[] b){
        String answer="";
        for(int i=0; i<n; i++){
            if(a[i]==b[i]) answer+="D";
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="A";
            else answer+="B";
        }

        return answer;
    }

    public static void main(String[] args){
        Array_3 T  =new Array_3();
        Scanner kb= new Scanner(System.in);
        int n= kb.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0; i<n; i++){ //A라는 사람이낸 가위바위보 정보를 a라는 배열에다가
            a[i]=kb.nextInt();
        }
        for(int i=0; i<n; i++){ //B라는 사람이낸 가위바위보 정보를 a라는 배열에다가 넣음
            b[i]=kb.nextInt();
        }

        //System.out.println(T.solution(n, a, b)); 이렇게 출력할경우 한줄에 나오게됨
        for(char x : T.solution(n, a, b).toCharArray()) System.out.println(x); //x가 배열이 되서 이렇게 하면 결과가 한줄로 나오게된다.
    }
}
