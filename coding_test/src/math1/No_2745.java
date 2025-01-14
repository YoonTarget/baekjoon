package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.time.format.DecimalStyle;
import java.util.StringTokenizer;

/**
 * 진법 변환
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	128 MB	71213	34898	29494	48.599%
 * 문제
 * B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
 *
 * 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
 *
 * A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 *
 * 입력
 * 첫째 줄에 N과 B가 주어진다. (2 ≤ B ≤ 36)
 *
 * B진법 수 N을 10진법으로 바꾸면, 항상 10억보다 작거나 같다.
 *
 * 출력
 * 첫째 줄에 B진법 수 N을 10진법으로 출력한다.
 *
 * 예제 입력 1
 * ZZZZZ 36
 * 예제 출력 1
 * 60466175
 */
public class No_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String target = st.nextToken();
        int base = Integer.parseInt(st.nextToken());

        if (base == 10) {
            System.out.println(target);
        } else {
            System.out.println(getResult(target, base));
        }

        br.close();
    }

    private static long getResult(String target, int base) {
        target = new StringBuilder(target).reverse().toString();
        int result = 0;
        for (int i = 0; i < target.length(); i++) {
            int temp = base;
            int num = (temp < 10 ? Integer.parseInt(String.valueOf(target.charAt(i))) : getNum(target.charAt(i)));
            if(i == 0) {
                result += num;
            }
            else {
                for(int j = 0; j < i - 1; j++) {
                    temp *= base;
                }
                result += num * temp;
            }
        }
        return result;
    }

    private static int getNum(char ch) {
        return ch >= 65 && ch <= 90 ? ch - 55 : Integer.parseInt(String.valueOf(ch));
    }
}
