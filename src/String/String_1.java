package String;

import java.util.Scanner;

class String_1 {
    public  int solution(String str, char t){ //solution이라는 메서드는 nonestatic으로 함
        int answer = 0; //대소 문자를 구분하지 않아서 그냥 다 대문자로 바꿔서 풀예정
        str = str.toUpperCase();//String이 다 대문자화 된다.
        t=Character.toUpperCase(t); //t는 문자니까 Character라는 클래스 변수 사용해서 대문자로 바꿔준다.
        //System.out.println(str + " " + t);
        /*for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==t) answer++;//string을 index로 접근하는것은 charAt
        }*/
        //for문말고 foreach문도 가능

        for(char x : str.toCharArray())//foreach문에서 str은 배열, ArrayList나 list 같은 것들이 와야된다. String은 안되기 때문에 string을 넣으려면
            //문자배열로 만들어주는 toCharArray()매서드를 사용한다.
            if(x==t) answer++;
        return answer;
    }
    public static void main(String[] args){
        String_1 T = new String_1();//static넣으면 이렇게 객체생성 필요없다.
        Scanner kb = new Scanner(System.in);
        String str=kb.next(); //next는 문자열을 하나 읽어들이는것. 콘솔창에서
        char c =kb.next().charAt(0); //문자를 하나 읽어야되니까 char / next는 문자열이라고 생각하고 읽음 문자한개만 가져와야되기 때문에 charAt
        //charAt은 String을 index로 접근 하는것.

        System.out.println(T.solution(str, c));



    }
}
