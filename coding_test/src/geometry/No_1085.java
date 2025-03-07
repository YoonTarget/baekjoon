package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 직사각형에서 탈출
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 2 초	128 MB	109804	71824	63534	65.594%
 * 문제
 * 한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 x, y, w, h가 주어진다.
 *
 * 출력
 * 첫째 줄에 문제의 정답을 출력한다.
 *
 * 제한
 * 1 ≤ w, h ≤ 1,000
 * 1 ≤ x ≤ w-1
 * 1 ≤ y ≤ h-1
 * x, y, w, h는 정수
 * 예제 입력 1
 * 6 2 10 3
 * 예제 출력 1
 * 1
 * 예제 입력 2
 * 1 1 5 5
 * 예제 출력 2
 * 1
 * 예제 입력 3
 * 653 375 1000 1000
 * 예제 출력 3
 * 347
 * 예제 입력 4
 * 161 181 762 375
 * 예제 출력 4
 * 161
 */
public class No_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int min = Math.min(x, y);
        while (st.hasMoreTokens()) {
            min = Math.min(min, Integer.parseInt(st.nextToken()) - (st.countTokens() == 0 ? y : x));
        }

        System.out.println(min);

        /* 다른 정답자 풀이 -> 더 직관적이고 효율적인 방법같음
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        System.out.println(Math.min(Math.min(x, w - x), Math.min(y, h - y)));
        */

        br.close();
    }
}
