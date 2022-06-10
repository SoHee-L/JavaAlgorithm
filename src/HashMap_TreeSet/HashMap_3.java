package HashMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class HashMap_3 {
    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i=0; i<k-1; i++) {//0부터니까 k보다 하루적게해서 미리 세팅해놓는다.
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);//arr의 키값을 가져오고 없으면 0을 리턴하고 1을 붙임
        }
        //여기서 부터 twoPoint 알고리즘
        int lt=0;
        for(int rt=k-1; rt<n; rt++){ //0인덱스부터 시작했으니 k일제부터 시작하고싶으면 k-1을 해야됨.
            HM.put(arr[rt], HM.getOrDefault(arr[rt], 0)+1);
            answer.add(HM.size());//그후 asnwer에 add함 매출액의 종류는 키의 종류와 같으니
            HM.put(arr[lt], HM.get(arr[lt])-1); //당연히 rt는 lt를 쫓아가니 값이 있음.
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]); //lt의 키의 값이 0이면 이키를 삭제한다는 알고리즘을 작성
            lt++;
        }

        return answer;
    }

    public static void main(String[] args){
        HashMap_3 T = new HashMap_3();
        Scanner kb = new Scanner(System.in);
        int n=kb.nextInt();
        int k= kb.nextInt(); // k는 연속된 매출액 길이 (4)
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        for (int x: T.solution(n, k, arr)) System.out.print(x+ " ");
    }
}
