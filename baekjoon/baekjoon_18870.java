import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;



// 문제
// 수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.

// Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.

// X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.

// 입력
// 첫째 줄에 N이 주어진다.

// 둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.

// 출력
// 첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.


public class baekjoon_18870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] nb=new int[n];
        int[] vb=new int[n];
        StringTokenizer st;
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            nb[i]=Integer.parseInt(st.nextToken());
        }
        vb=nb.clone();
        Arrays.sort(vb);
        int count=0;
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hmap.containsKey(vb[i])){
                hmap.put(vb[i],count++);
            }
        };
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(hmap.get(nb[i])+" ");
        }
        
        System.out.println(sb);
    }
}
