package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 진법 변환 2
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 0.5 초 (추가 시간 없음)	256 MB	65068	30229	25976	46.203%
 * 문제
 * 10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
 *
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 *
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 *
 * 입력
 * 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36) N은 10억보다 작거나 같은 자연수이다.
 *
 * 출력
 * 첫째 줄에 10진법 수 N을 B진법으로 출력한다.
 *
 * 예제 입력 1
 * 60466175 36
 * 예제 출력 1
 * ZZZZZ
 */
public class No_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if(b == 10) {
            System.out.println(n);
        }
        else {
            while (n >= b) {
                int s = n % b;
                sb.append(getNum(s));
                n /= b;
            }
            System.out.println(sb.append(getNum(n)).reverse());
        }

        br.close();
    }

    private static char getNum(int n) {
        if(n < 10) {
            return (char) (n + 48);
        }
        else {
            return (char) (n + 55);
        }
    }
}
