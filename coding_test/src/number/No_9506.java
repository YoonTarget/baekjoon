package number;

import java.io.*;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 약수들의 합 다국어
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 2 초	128 MB	58780	29462	26120	50.797%
 * 문제
 * 어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
 *
 * 예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
 *
 * n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.
 *
 * 입력
 * 입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)
 *
 * 입력의 마지막엔 -1이 주어진다.
 *
 * 출력
 * 테스트케이스 마다 한줄에 하나씩 출력해야 한다.
 *
 * n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
 *
 * 이때, 약수들은 오름차순으로 나열해야 한다.
 *
 * n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
 *
 * 예제 입력 1
 * 6
 * 12
 * 28
 * -1
 * 예제 출력 1
 * 6 = 1 + 2 + 3
 * 12 is NOT perfect.
 * 28 = 1 + 2 + 4 + 7 + 14
 */
public class No_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder result = new StringBuilder();
        String line;

        while ((line = br.readLine()) != null && !"-1".equals(line)) {
            StringBuilder sb = new StringBuilder(line);
            int n = Integer.parseInt(line);

            SortedSet<Integer> set = getFactors(n);
            result = getResult(set, sb, result);
        }

        bw.write(result.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    private static StringBuilder getResult(SortedSet<Integer> set, StringBuilder sb, StringBuilder result) {
        if(set != null) {
            for (Integer i : set) {
                if(i == 1) {
                    sb.append(" = ");
                }
                sb.append(i);
                if(!Objects.equals(set.last(), i)) {
                    sb.append(" + ");
                }
            }
            result.append(sb);
        }
        else {
            result.append(sb).append(" is NOT perfect.");
        }
        return result.append("\n");
    }

    private static SortedSet<Integer> getFactors(int n) {
        SortedSet<Integer> set = new TreeSet<>();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if(n % i == 0) {
                if(set.contains(i)) {
                    break;
                }
                set.add(i);
                sum += i;
                if(i > 1) {
                    set.add(n / i);
                    sum += n / i;
                }
            }
        }

        if(n == sum) {
            return set;
        }
        else {
            return null;
        }
    }
}
