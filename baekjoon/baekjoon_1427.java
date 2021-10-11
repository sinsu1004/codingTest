import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;




// 문제
// 배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

// 입력
// 첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

// 출력
// 첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.

public class baekjoon_1427 {
    public static void main (String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        String n=br.readLine();
        ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<n.length();i++){
            int a=n.charAt(i)-'0';
            al.add(a);
        }
        Collections.sort(al,Comparator.reverseOrder());
        for(int i:al){
            sb.append(i);
        }
        System.out.println(sb);


        

        
    }
}
