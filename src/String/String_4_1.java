package String;

import java.util.ArrayList;
import java.util.Scanner;

class String_4_1 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s= x.toCharArray(); //x는 String이니 하나하나 비교하려면 String으로 할 순 없으니 문자 배열로 바꿔줘야한다.
            int lt=0, rt=x.length()-1;
            while (lt<rt){
                char tmp=s[lt]; //여기서 바꿔줌 reverse대신 직접
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;

            }
            String tmp=String.valueOf(s); //answer가 ArrayList이니까 String화 시켜야된다. /valueOf는 static 메서드라 객체.이 아닌 class.으로 접근해도 된다. 그래서 x.이아닌 String.이라고 적음 s라는 배열을 스트링화 시켜줌
            answer.add(tmp);
        }

        return answer;
        }


    public static void main(String[] args){
        String_4_1 T = new String_4_1();//static넣으면 이렇게 객체생성 필요없다.
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt(); // 문제에서 3이 주어줬으니 3을 읽도록 만듬.
        String[] str = new String[n]; // string 배열을 동적으로 n개 만듬.
        for(int i=0; i<n; i++){
            str[i]=kb.next(); // string n개단어를 배열에다가 하나씩 넣어줌.
        }
        for(String x : T.solution(n, str) ){
            System.out.println(x);
        }


    }
}
