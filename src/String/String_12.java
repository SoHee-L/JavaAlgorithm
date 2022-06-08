package String;

import java.util.Scanner;

class String_12 {
    public String solution(int n, String s){
        String answer="";
        for(int i =0; i<n; i++){
            String tmp= s.substring(0,7).replace('#','1').replace('*','0'); // 0~7개까지 추출 하지만 이렇게만 하면 앞에서 7개만 4번 뽑아냄
            //replace는 #은 1로 *은 0으로 바뀌어줌
            //System.out.println(tmp); 밑에 s를 설정해주지않았을때 어떻게 나오는지 확인
           int num=Integer.parseInt(tmp,2); //10진수를 2진수로 바꿔줘라라는 의미
            answer+=(char)num;

            s= s.substring(7); //s를 7로 초기화해주면 0~7까지 계속 바뀌면서 나눠진다.
        }

        return answer;
    }

    public static void main(String[] args){
        String_12 T = new String_12();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        String str= kb.next();
        System.out.print(T.solution(n, str));

    }
}
