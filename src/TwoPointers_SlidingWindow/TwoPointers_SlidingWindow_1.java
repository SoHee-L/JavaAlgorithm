package TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

class TwoPointers_SlidingWindow_1 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) { //n은 a배열의 크기 m은 b배열의 크기
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) { //p1이 됐건 p2가 됐건 n이나 m보다 커진다면 while문을 멈춤
            if (a[p1] < b[p2]) answer.add(a[p1++]); //증감연산자가 후위이기때문에 p1이 가리키는값을 add하고 p1값이 1 증가함.
            else answer.add(b[p2++]);
        }
        while (p1 < n) answer.add(a[p1++]); //p1이남은지 p2가 남은지 모르기 때문에 p1이 남아있으면 p1을 증가시키는 식을 만들어줘야됨.
        while (p2 < m) answer.add(b[p2++]); //p2도 마찬가지로 p2가 남으면 p2를 증가시켜준다.

        return answer;
    }

    public static void main(String[] args) {
        TwoPointers_SlidingWindow_1 T = new TwoPointers_SlidingWindow_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n]; //첫번째 배열은 a배열에 n개 잡음
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();

        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : T.solution(n, m, a, b)) System.out.print(x + " ");
    }
}