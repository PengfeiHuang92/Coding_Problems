public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-321121321));
    }

    public static int reverse(int k) {
        int tmpInt = Integer.parseInt(new StringBuilder().append(Math.abs(k)).reverse().toString());

        if (k < 0) {
            tmpInt *= -1;
        }
        return tmpInt;
    }

}
