
public class test {
    public static void main(String[] args) {

        int res = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                tmp += 1;
            } else {
                tmp = 0;
            }
            res += tmp;
            res %= 1000000007;
        }

    }

}
/****
 * 3 6 0 6 0 6 1 7 1 8 1 9 4 19 0 19 0 19 0 19 0 19 80000 1052556371 0
 * 1052556371 1 1052556372 1 1052556373 1002 1053058876 0 1053058876 0
 * 1053058876 0 1053058876 1 1053058877 0 1053058877 1 1053058878
 */