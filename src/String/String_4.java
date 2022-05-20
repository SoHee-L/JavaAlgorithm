package String;

import java.util.ArrayList;
import java.util.Scanner;

class String_4 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        //str에 있는 string 배열을 여기서 뒤집여야하니까
        for(String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();  //StringBuilder=문자열을 다루는 클래스이다. StringBuilder 생성자에 x에 들어가는 단어로 객체를 만들어라.
            //StringBuilder에는 reverse라는 단어를 뒤집어주는 메서드가 있다.reverse를 사용하고 string화 시켜야지 다시 String 객체로 들어간다 그래서 toString메서드 사용
            //String과 StringBuilder차이점
            //String은 String끼리 더하거나 replace하면 새로운객체가 생성된다. String을 하나 만들어 놓으면 원래는 그자체는 값을 변경할 수가 없다.
            //그래서 새로운 객체를 자꾸 만드는데 StringBuilder는 첨에 만든 객체를 가지고 계속 연산하기 때문에 메모리 낭비가 없어서 String 연산이 많아지면 StringBuilder를 쓴다.
            answer.add(tmp); //ArrayList에 추가하는것은 add()메서드.
        }


        return answer;
        }


    public static void main(String[] args){
        String_4 T = new String_4();//static넣으면 이렇게 객체생성 필요없다.
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
