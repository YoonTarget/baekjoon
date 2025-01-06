package deep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 그룹 단어 체커
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 2 초	128 MB	178838	95712	78523	53.825%
 * 문제
 * 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 *
 * 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 *
 * 출력
 * 첫째 줄에 그룹 단어의 개수를 출력한다.
 *
 * 예제 입력 1
 * 3
 * happy
 * new
 * year
 * 예제 출력 1
 * 3
 * 예제 입력 2
 * 4
 * aba
 * abab
 * abcabc
 * a
 * 예제 출력 2
 * 1
 * 예제 입력 3
 * 5
 * ab
 * aa
 * aca
 * ba
 * bb
 * 예제 출력 3
 * 4
 * 예제 입력 4
 * 2
 * yzyzy
 * zyzyz
 * 예제 출력 4
 * 0
 * 예제 입력 5
 * 1
 * z
 * 예제 출력 5
 * 1
 * 예제 입력 6
 * 9
 * aaa
 * aaazbz
 * babb
 * aazz
 * azbz
 * aabbaa
 * abacc
 * aba
 * zzaz
 * 예제 출력 6
 * 2
 */
public class No_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = Optional.ofNullable(br.readLine())
                .orElse("0"); // null 체크

        if(!num.matches("-?\\d+")) return; // 숫자 여부 체크

        int wordCnt = Integer.parseInt(num);

        if(wordCnt <= 0 || wordCnt > 100) return; // 단어 개수 체크

        String[] words = new String[wordCnt];
        int count = 0;

        for(int i = 0; i < wordCnt; i++) {
            String str = br.readLine();
            if(str == null || !isLowerCase(str) || str.length() > 100 || isDuplicate(words, str)) return; // 문자열 조건 체크
            words[i] = str;
            if(isGroupWord(removeRepeats(words[i]))) count++; // 그룹단어 체크
        }

        System.out.println(count);

        br.close();
    }

    /*// GPT
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int wordCnt = Integer.parseInt(br.readLine()); // 단어 개수 입력
        int count = 0; // 그룹 단어 개수

        for (int i = 0; i < wordCnt; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                count++; // 그룹 단어라면 count 증가
            }
        }

        System.out.println(count); // 결과 출력
        br.close();
    }*/

    private static String removeRepeats(String str) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != ((i + 1) == str.length() ? '?' : str.charAt(i + 1))) list.add(String.valueOf(str.charAt(i))); // 연속된 문자만 중복 제거
        }
        return String.join("", list);
    }

    private static boolean isGroupWord(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for(char ch : str.toCharArray()) {
            set.add(ch);
        }
        return set.size() == str.length();
    }

    /*// GPT
    private static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26]; // 알파벳 방문 여부
        char prevChar = '\0'; // 이전 문자 저장

        for (char c : word.toCharArray()) {
            if (c != prevChar) { // 연속된 문자가 아니라면
                if (seen[c - 'a']) { // 이미 나온 문자라면 그룹 단어가 아님
                    return false;
                }
                seen[c - 'a'] = true; // 문자 방문 체크
                prevChar = c; // 이전 문자 갱신
            }
        }
        return true; // 모든 문자가 그룹 단어 조건 만족
    }*/

    private static boolean isDuplicate(String[] words, String str) {
        return Arrays.asList(words).contains(str);
    }

    private static boolean isLowerCase(String str) {
        return str.matches("[a-z]+");
    }
}
