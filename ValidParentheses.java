import java.util.HashMap;
import java.util.Stack;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must
 * be closed in the correct order.
 * 
 * 
 * Example 1: Input: s = "()" Output: true
 * 
 * Example 2: Input: s = "()[]{}" Output: true
 * 
 * Example 3: Input: s = "(]" Output: false
 * 
 * Example 4: Input: s = "([)]" Output: false
 * 
 * Example 5: Input: s = "{[]}" Output: true
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 104 s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        try {
            File myObj = new File("test.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("data:" + data);
                System.out.println(isValid(data));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static boolean isValid(String s) {
        // Replace all the spaces with ""
        s = s.replaceAll("\\s", "");

        HashMap<Character, Character> tmpMap = new HashMap<Character, Character>();
        tmpMap.put(']', '[');
        tmpMap.put(')', '(');
        tmpMap.put('}', '{');

        Stack<Character> tmpStack = new Stack<Character>();
        if (tmpMap.containsKey(s.charAt(0)))
            return false;

        tmpStack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (tmpMap.containsKey(s.charAt(i)) && !tmpStack.isEmpty()) {
                char topChar = tmpStack.pop();
                if (topChar != tmpMap.get(s.charAt(i)))
                    return false;
            } else {
                tmpStack.push(s.charAt(i));
            }
        }
        return tmpStack.isEmpty();
    }
}
