package multi_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 색종이
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	128 MB	81542	52442	44239	64.420%
 * 문제
 * 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다. 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
 *
 *
 *
 * 예를 들어 흰색 도화지 위에 세 장의 검은색 색종이를 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260이 된다.
 *
 * 입력
 * 첫째 줄에 색종이의 수가 주어진다. 이어 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다. 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고, 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다
 *
 * 출력
 * 첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.
 *
 * 예제 입력 1
 * 3
 * 3 7 / 13 7 / 13 17 / 3 17
 * 15 7 / 25 7 / 25 17 / 15 17
 * 5 2 / 15 2 / 15 12 / 5 12
 * 예제 출력 1
 * 260
 */
public class No_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int maxX = 0;
        int maxY = 0;
        int minX = 0;
        int minY = 0;

        int n = Integer.parseInt(br.readLine());
//        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
//            int count = st.countTokens();
//            for(int i = 0; i < count; i++) {
//                arr[i] = st.nextToken();
//            }
            maxX = getMaxValue(maxX, x);
            minX = (i == 0 ? x : getMinValue(minX, x));
            maxY = getMaxValue(maxY, y);
            minY = (i == 0 ? y : getMinValue(minY, y));
        }

        System.out.println((maxX + 10 - minX) * (maxY + 10 - minY));

        br.close();
    }

    private static int getMaxValue(int max, int num) {
        return Math.max(max, num);
    }

    private static int getMinValue(int min, int num) {
        return Math.min(min, num);
    }
}
