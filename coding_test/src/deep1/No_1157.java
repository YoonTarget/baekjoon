package deep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 단어 공부
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 2 초	128 MB	318933	128596	100987	39.968%
 * 문제
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
 *
 * 입력
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 *
 * 출력
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 *
 * 예제 입력 1
 * Mississipi
 * 예제 출력 1
 * ?
 * 예제 입력 2
 * zZa
 * 예제 출력 2
 * Z
 * 예제 입력 3
 * z
 * 예제 출력 3
 * Z
 * 예제 입력 4
 * baaa
 * 예제 출력 4
 * A
 */
public class No_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        if(str == null || isOverLines(str) || isInvalidChar(str)) { // 글자 체크, 문자 체크
            return;
        }

        str = str.toUpperCase(); // 대문자 변환

        Map<Character, Integer> map = new HashMap<>();
        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxCnt = 0;
        char maxChar = ' ';
        boolean isDuplicate = false;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            int cnt = entry.getValue();
            if (cnt > maxCnt) {
                maxCnt = cnt;
                maxChar = entry.getKey();
                isDuplicate = false;
            } else if (cnt == maxCnt) {
                isDuplicate = true;
            }
        }

        System.out.println(isDuplicate ? "?" : maxChar);

        br.close();
    }

    // 글자 제한 (1,000,000글자)
    private static boolean isOverLines(String str) {
        return str.length() > 1000000;
    }

    // 알파벳 대문자와 소문자만 가능
    private static boolean isInvalidChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!Character.isUpperCase(ch) && !Character.isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }
}
