package String;

import java.util.Scanner;

class String_5 {
    public String solution(String str) {
        String answer; //answer에는 특정문자만 뒤집음
        char[] s = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) lt++; //isAlphabetic는 s에 문자가 알파벳이면 참이 된다는 메서드
                //lt가 알파벳이 아닐때 증가
            else if (!Character.isAlphabetic(s[rt])) rt--;
                //rt가 알파벳이 아닐때 감소
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
                //그밖의 경우

            }
        }
        answer = String.valueOf(s); //valueOf라는 메서드가 s라는 기본형데이터의 배열을 String화 시켜줌

        return answer;
    }


    public static void main(String[] args) {
        String_5 T = new String_5();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
}
