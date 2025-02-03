package number;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 소수
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	128 MB	166631	66733	56091	39.737%
 * 문제
 * 자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
 *
 * 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.
 *
 * 입력
 * 입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
 *
 * M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.
 *
 * 출력
 * M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다.
 *
 * 단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 *
 * 예제 입력 1
 * 60
 * 100
 * 예제 출력 1
 * 620
 * 61
 * 예제 입력 2
 * 64
 * 65
 * 예제 출력 2
 * -1
 */
public class No_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        Map<String, Integer> map = getResult(m, n);

        bw.write(map.get("sum") == 0 ? "-1" : map.get("sum") + "\n" + map.get("min"));

        bw.flush();
        bw.close();
        br.close();
    }

    private static Map<String, Integer> getResult(int m, int n) {
        Map<String, Integer> map = new HashMap<>();
        int sum = 0;
        int min = n;

        if (m < 2) m = 2;

        for (int i = m; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += i;
                min = Math.min(min, i);
            }
        }

        map.put("sum", sum);
        map.put("min", min);

        return map;
    }
}
