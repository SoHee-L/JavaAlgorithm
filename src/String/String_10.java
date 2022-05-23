package String;

import java.util.Scanner;

class String_10 {
    public int[] solution(String s, char t) { //문자열받고 문자받은후
        int[] answer = new int[s.length()]; //그배열 s의 길이 만큼
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t) { //i가 입력한 e냐를 묻는 부분.
                p = 0;
                answer[i] = p; //p를 0으로 초기화하고 answer i에 p를 넣어줌
            } else {
                p++; //그게 아니면 p를 1증가 시키고 넣어주면 된다. 그럼 왼쪽으로 부터 떨어진 거리가 나옴.
                answer[i] = p;
            }
        }

        p=1000;
        for(int i=s.length()-1; i>=0; i--) { // 맨끝에서 비교하는것이니 length()-1로 계산해준다.
            if (s.charAt(i) == t) p = 0;
            else {
                p++;
                answer[i] = Math.min(answer[i], p); // 기존값과 p중 작은 값으로 넣으라는 의미
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String_10 T = new String_10();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); //문자 한개를 읽을때

        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}
