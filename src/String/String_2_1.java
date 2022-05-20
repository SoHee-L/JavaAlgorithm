package String;

import java.util.Scanner;

class String_2_1 {
    public String solution(String str){
        String answer="";//answer에 대소문자 변환된것 리턴함
        for(char x:str.toCharArray()){
            //아스키넘버로 푸는법 대문자는 65~90 소문자는 97~122
            if(x>=97 && x<=122) answer +=(char)(x-32); // 소문자에서 32를 빼면 대문자로간다. 근데 숫자로 나오니 char로 형변환 해줘야된다.
            else answer+=(char)(x+32); // 여기도 형변환 해줘야된다.
        }
        return answer;
    }
    public static void main(String[] args){
        String_2_1 T = new String_2_1();//static넣으면 이렇게 객체생성 필요없다.
        Scanner kb = new Scanner(System.in);
        String str=kb.next();
        System.out.println(T.solution(str)); //T.solution해서 문자열을 넘김



    }
}
