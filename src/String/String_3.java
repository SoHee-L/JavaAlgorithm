package String;

import java.util.Scanner;

class String_3 {
    public String solution(String str){
        String answer = ""; //가장 길이가 긴단어를 저장하는 곳.
        int m= Integer.MIN_VALUE; //MIN_VALUE가장 작은값으로 초기화해주는 메서드
        String[] s=str.split(" "); //split은 단어들을 띄어쓰기로 구분해서 스트링배열에 저장해주는 메서드. String이니까 ""로 구분 / ''는 안된다.
        for(String x: s){ //x라는 배열에 단어가 하나하나 들어가는가를 의미 배열이니까 foreach가능
            int len=x.length();
            if(len>m){
                m=len; //최대값이 m으로 갱신되고 최댓값이 갱신될때마다 answer에 넣어준다.
                answer=x;
            }

        }

        return answer;
        }


    public static void main(String[] args){
        String_3 T = new String_3();//static넣으면 이렇게 객체생성 필요없다.
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine(); // 문장을 입력받아야됨 단어가 아닌 한줄을 입력받아야되서 next가 아닌 nextLine을 사용한다.
        System.out.println(T.solution(str)); //T.solution해서 문자열을 넘김



    }
}
