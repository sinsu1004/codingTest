// 문제
// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

// 출력
// 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class baekjoon_2751 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        
        int n=sc.nextInt();
        ArrayList<Integer> nn= new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            nn.add(sc.nextInt());
        }
        Collections.sort(nn);
        for(int i:nn){
            sb.append(i).append('\n');
        }

        System.out.println(sb);
    }
    
}

//Array.sort 보다  Collection.sort 가 속도가 더빠름