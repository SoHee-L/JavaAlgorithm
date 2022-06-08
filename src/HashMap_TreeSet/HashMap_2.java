package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

class HashMap_2 {
    public  String solution(String s1, String s2){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x,0)+1); //x라는 키를 생성하고 값을 정하는데 값이 있을 수도 없을수도 있으니 getOrDefault을 사용

        }
        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0)  return "NO";
                //x값이 존재하지 않을때 키값이 참이되니까 !를 사용한다. map.get(x)==0는 갯수가 존재하지 않는것을 의미
                map.put(x,map.get(x)-1);  //값을 빼주는 작업인데 value가 없는 key는 없을 테니 -1해서 값을 작게해서 세팅한다.

            }


        return answer;
    }

    public static void main(String[] args){
        HashMap_2 T = new HashMap_2();
        Scanner kb = new Scanner(System.in);
        String a= kb.next();
        String b= kb.next();
        System.out.print(T.solution(a,b));
    }
}
