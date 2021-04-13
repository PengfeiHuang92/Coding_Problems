public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("1000", "10"));
    }

    public static String addBinary(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();
        int remind = 0;
        String result = "";
        char res = ' ';
        while (aLength > 0 || bLength > 0) {

            int i = (aLength > 0) ? Character.getNumericValue(a.charAt(aLength - 1)) : 0;
            int j = (bLength > 0) ? Character.getNumericValue(b.charAt(bLength - 1)) : 0;

            res = (char) (((i + j + remind) % 2) + '0');
            remind = (i + j + remind) / 2;

            result = res + result;

            aLength--;
            bLength--;

        }
        if (remind == 1)
            result = '1' + result;

        return result;
    }
}
