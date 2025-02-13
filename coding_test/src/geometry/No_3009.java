package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 네 번째 점 다국어
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	128 MB	67215	48884	43784	73.485%
 * 문제
 * 세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.
 *
 * 입력
 * 세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.
 *
 * 출력
 * 직사각형의 네 번째 점의 좌표를 출력한다.
 *
 * 예제 입력 1
 * 5 5
 * 5 7
 * 7 5
 * 예제 출력 1
 * 7 7
 * 예제 입력 2
 * 30 20
 * 10 10
 * 10 20
 * 예제 출력 2
 * 30 10
 */
public class No_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arrX = new int[3];
        int[] arrY = new int[3];

        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arrX);
        Arrays.sort(arrY);

        System.out.println((arrX[0] == arrX[1]? arrX[2] : arrX[0]) + " " + (arrY[0] == arrY[1]? arrY[2] : arrY[0]));

        br.close();
    }
}
