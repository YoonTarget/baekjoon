package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 그대로 출력하기
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	256 MB	268330	87093	72679	34.847%
 * 문제
 * 입력 받은 대로 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 *
 * 출력
 * 입력받은 그대로 출력한다.
 *
 * 예제 입력 1
 * Hello
 * Baekjoon
 * Online Judge
 * 예제 출력 1
 * Hello
 * Baekjoon
 * Online Judge
 */
public class No_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str;
        int lineCnt = 0;

        while ((str = br.readLine()) != null && !(str = str.trim()).isEmpty()) {
            if(++lineCnt > 100) { // 입력은 100줄까지
                return;
            }
            if(isOver100Lines(str) || isInvalidChar(str)) { // 글자 체크, 문자 체크
                return;
            }
            sb.append(str).append("\n");
        }

        System.out.println(sb);

        br.close();
    }

    private static boolean isOver100Lines(String str) {
        return str.length() > 100;
    }

    private static boolean isInvalidChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isDigit(ch) && !Character.isUpperCase(ch) && !Character.isLowerCase(ch) && !Character.isWhitespace(ch)) {
                return true;
            }
        }
        return false;
    }
}
