import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class AddtoArrayFormofInteger {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[] { 1, 2, 3, 4 }, 700));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<Integer>();

        num[num.length - 1] = num[num.length - 1] + k;
        for (int i = num.length - 1; i >= 0; i--) {
            while (num[i] / 10 != 0 && i != 0) {
                num[i - 1] += num[i] / 10;
                num[i] = num[i] % 10;
            }
        }

        if (num[0] / 10 != 0) {
            int tmp = num[0] / 10;
            num[0] = num[0] % 10;
            while (tmp != 0) {
                res.add(tmp % 10);
                tmp = tmp / 10;
            }
        }
        Collections.reverse(res);
        for (int i : num) {
            res.add(i);
        }
        return res;
    }
}