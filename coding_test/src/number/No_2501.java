package number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 약수 구하기
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	128 MB	82038	40678	35820	50.203%
 * 문제
 * 어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다.
 *
 * 6을 예로 들면
 *
 * 6 ÷ 1 = 6 … 0
 * 6 ÷ 2 = 3 … 0
 * 6 ÷ 3 = 2 … 0
 * 6 ÷ 4 = 1 … 2
 * 6 ÷ 5 = 1 … 1
 * 6 ÷ 6 = 1 … 0
 * 그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.
 *
 * 두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K번째로 작은 수를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N과 K가 빈칸을 사이에 두고 주어진다. N은 1 이상 10,000 이하이다. K는 1 이상 N 이하이다.
 *
 * 출력
 * 첫째 줄에 N의 약수들 중 K번째로 작은 수를 출력한다. 만일 N의 약수의 개수가 K개보다 적어서 K번째 약수가 존재하지 않을 경우에는 0을 출력하시오.
 *
 * 예제 입력 1
 * 6 3
 * 예제 출력 1
 * 3
 * 예제 입력 2
 * 25 4
 * 예제 출력 2
 * 0
 * 예제 입력 3
 * 2735 1
 * 예제 출력 3
 * 1
 */
public class No_2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        SortedSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                if(set.contains(i)) {
                    break;
                }
                set.add(i);
                set.add(n / i);
            }
        }

        if(k <= set.size()) {
            System.out.println(Arrays.asList(set.toArray()).get(k - 1));
        }
        else {
            System.out.println(0);
        }

        br.close();
    }
}
