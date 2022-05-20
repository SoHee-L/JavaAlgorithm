package String;

import java.util.Scanner;

class String_3_1 {
    public String solution(String str){
        //split이 아닌 indexof로 하게 되면 pos라는 정수 필요

        String answer = ""; //가장 길이가 긴단어를 저장하는 곳.
        int m= Integer.MIN_VALUE, pos; //MIN_VALUE가장 작은값으로 초기화해주는 메서드
        while ((pos=str.indexOf(' '))!=-1) { // ' '를 발견 못하면 -1을 리턴해준다는 얘기 발견하면 indexof 번호를 리턴
            String tmp=str.substring(0,pos); //제일 앞에서부터 pos전까지 잘라낸다는 의미
            int len=tmp.length();
            if(len>m){ //가장 앞쪽에 위치한 단어를 가지고오니 >=를 하면 안됨. 클때만 바꿔줘라하면 앞쪽단어만 유지됨.
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1);


        }
        if(str.length()>m) answer=str; // 마지막 단어가 tmp에 들어가지 못하니 꼭 이렇게 처리를 해줘야된다.

        return answer;
        }


    public static void main(String[] args){
        String_3_1 T = new String_3_1();//static넣으면 이렇게 객체생성 필요없다.
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine(); // 문장을 입력받아야됨 단어가 아닌 한줄을 입력받아야되서 next가 아닌 nextLine을 사용한다.
        System.out.println(T.solution(str)); //T.solution해서 문자열을 넘김



    }
}
