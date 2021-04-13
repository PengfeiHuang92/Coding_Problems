import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.
/*
*Input: arr = [4,3,1,1,3,3,2], k = 3
*Output: 2
*Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left.
*/

public class LeastNumberofUniqueafterK {
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 2, 2 };
        System.out.println("result:" + Integer.toString(findLeastNumOfUniqueInts(array, 4)));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

        Arrays.sort(arr);
        Map<Integer, Integer> tmpMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (!tmpMap.containsKey(arr[i])) {
                int tmpCount = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        tmpCount++;
                    } else {
                        break;
                    }
                }
                tmpMap.put(arr[i], tmpCount);
            }
        }

        List<Integer> tmpValue = new ArrayList<Integer>(tmpMap.values());
        Collections.sort(tmpValue);

        int tmpSize = tmpValue.size();
        for (Integer i : tmpValue) {
            if (k > 0) {
                k -= i;
                if (k >= 0)
                    tmpSize--;
            }
        }
        return tmpSize;
    }
}