package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;
//HashMap의 다른 메서드
class HashMap_1_1 {
    public char solution(int n, String s){
        char answer= ' ';
        HashMap<Character, Integer> map = new HashMap<>(); //해쉬맵 사용법 HashMap<key의 data형, value의 data형>
        //map.put('A',3); map.put은 A라는 키가 생기고 여기에 3이 들어간다는 의미이다.
        for(char x: s.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1); //map.getOrDefault는 x의 키값을 가져오되 x의 키값이 없으면 0을 가져온다. 카운팅할때 중요
            //+1을 해줘서 키값으로 카운티응ㄹ 한다.
        }
        //어떤 특정키가 있는지 확인해 볼 수 있다.
        //System.out.print(map.containsKey('A')); //A라는 키가 있는지 물어봄 containsKey는 true or false를 리턴한다.

        //키의 갯수를 알려준다.
        //System.out.print(map.size());

        //특정 키를 삭제한다.
        System.out.print(map.remove('A'));

        int max=Integer.MIN_VALUE; // max니까 가장작은 값으로 초기화
        for(char key : map.keySet()) { //존재하는 key들을 탐색하는 방법
            //System.out.println(key+" "+map.get(key)); //value값을 가져오는것은 map.get
            if(map.get(key)>max){
                max=map.get(key); //key가 max보다 크면 key값으로 바꿔줌
                answer=key; // key가 답이 된다.
            }
        }

        return answer;
    }

    public static void main(String[] args){
        HashMap_1_1 T = new HashMap_1_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(); //학생수
        String str= kb.next();
        System.out.print(T.solution(n, str));
    }
}
