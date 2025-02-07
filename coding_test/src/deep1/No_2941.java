package deep1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 크로아티아 알파벳 다국어
 * 시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
 * 1 초	128 MB	199889	89332	75068	44.565%
 * 문제
 * 예전에는 운영체제에서 크로아티아 알파벳을 입력할 수가 없었다. 따라서, 다음과 같이 크로아티아 알파벳을 변경해서 입력했다.
 *
 * 크로아티아 알파벳	변경
 * č	c=
 * ć	c-
 * dž	dz=
 * đ	d-
 * lj	lj
 * nj	nj
 * š	s=
 * ž	z=
 * 예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 *
 * dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
 *
 * 입력
 * 첫째 줄에 최대 100글자의 단어가 주어진다. 알파벳 소문자와 '-', '='로만 이루어져 있다.
 *
 * 단어는 크로아티아 알파벳으로 이루어져 있다. 문제 설명의 표에 나와있는 알파벳은 변경된 형태로 입력된다.
 *
 * 출력
 * 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
 *
 * 예제 입력 1
 * ljes=njak
 * 예제 출력 1
 * 6
 * 예제 입력 2
 * ddz=z=
 * 예제 출력 2
 * 3
 * 예제 입력 3
 * nljj
 * 예제 출력 3
 * 3
 * 예제 입력 4
 * c=c=
 * 예제 출력 4
 * 2
 * 예제 입력 5
 * dz=ak
 * 예제 출력 5
 * 3
 */
public class No_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        if(str == null || str.length() > 100 || isInvalidChar(str)) { // 입력 조건 체크
            return;
        }

        System.out.println(getAnswer(str));

        br.close();
    }

    private static boolean isInvalidChar(String str) {
        for(char ch : str.toCharArray()) {
            if(!Character.isLowerCase(ch) && ch != '-' && ch != '=') { // 알파벳 소문자, -, = (아스키 코드)
                return true;
            }
        }
        return false;
    }

    private static int getAnswer(String str) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--) {
            sb.delete(0, sb.length());
            char ch = str.charAt(i);
            sb.append(ch);
            char prevCh = i > 0 ? str.charAt(i - 1) : '?';
            switch(ch) {
                case '-':
                    if(prevCh == 'c' || prevCh == 'd') {
                        sb.append(prevCh);
                        i--;
                    }
                    break;
                case '=':
                    if(prevCh == 'c' || prevCh == 's') {
                        sb.append(prevCh);
                        i--;
                    }
                    else if(prevCh == 'z') {
                        char prevPrevCh = i > 1 ? str.charAt(i - 2) : '?';
                        if(prevPrevCh == 'd') {
                            sb.append(prevCh).append(prevPrevCh);
                            i-=2;
                        }
                        else {
                            sb.append(prevCh);
                            i--;
                        }
                    }
                    break;
                case 'j':
                    if(prevCh == 'l' || prevCh == 'n') {
                        i--;
                    }
            }
            list.add(sb.toString());
        }

        return list.size();
    }
}
