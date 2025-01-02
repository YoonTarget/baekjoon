package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 다이얼 다국어
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	128 MB	150732	88262	76616	58.391%
 * 문제
 * 상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.
 *
 *
 *
 * 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
 *
 * 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
 *
 * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
 *
 * 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어의 길이는 2보다 크거나 같고, 15보다 작거나 같다.
 *
 * 출력
 * 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
 *
 * 예제 입력 1
 * WA
 * 예제 출력 1
 * 13
 * 예제 입력 2
 * UNUCIC
 * 예제 출력 2
 * 36
 */
public class No_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 문자열 길이 체크
        if(isInvalidLength(str)) {
            return;
        }

        int minTime = getMinTime(str);

        if(minTime == -1) {
            return;
        }
        else {
            System.out.println(minTime);
        }

        br.close();
    }

    private static boolean isInvalidLength(String str) {
        return str.length() < 2 || str.length() > 15;
    }

    private static int getMinTime(String str) {
        String[] arr = str.split("");
        int sum = 0;
        for (String s : arr) {
            if(s.charAt(0) < 65 || s.charAt(0) > 90) { // 알파벳 대문자 체크
                return -1;
            }
            sum += convertToNum(s);
        }
        return sum + arr.length;
    }

    private static int convertToNum(String str) {
        char ch = str.charAt(0);
        if(ch < 68) { // A,B,C
            return 2;
        }
        else if(ch < 71) { // D,E,F
            return 3;
        }
        else if(ch < 74) { // G,H,I
            return 4;
        }
        else if(ch < 77) { // J,K,L
            return 5;
        }
        else if(ch < 80) { // M,N,O
            return 6;
        }
        else if(ch < 84) { // P,Q,R,S
            return 7;
        }
        else if(ch < 87) { // T,U,V
            return 8;
        }
        else { // W,X,Y,Z
            return 9;
        }
    }
}
