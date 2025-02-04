package number;

import java.io.*;

/**
 * 소인수분해
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	256 MB	128180	70958	54864	53.938%
 * 문제
 * 정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.
 *
 * 출력
 * N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.
 *
 * 예제 입력 1
 * 72
 * 예제 출력 1
 * 2
 * 2
 * 2
 * 3
 * 3
 * 예제 입력 2
 * 3
 * 예제 출력 2
 * 3
 * 예제 입력 3
 * 6
 * 예제 출력 3
 * 2
 * 3
 * 예제 입력 4
 * 2
 * 예제 출력 4
 * 2
 * 예제 입력 5
 * 9991
 * 예제 출력 5
 * 97
 * 103
 */
public class No_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) return;

        int x = n;

        for (int i = 2; i * i <= n; i++) {
            while (x % i == 0) {
//                bw.write(i + "\n");
                System.out.println(i);
                x /= i;
            }
        }

        if (x != 1) /*bw.write(x + "\n")*/ System.out.println(x);;

        /*int m = 2;

        while (n >= m) {
            if (n % m == 0) {
                n /= m;
                bw.write(m + "\n");
            }
            else {
                m++;
            }
        }*/

//        bw.flush();
//        bw.close();
        br.close();
    }
}
