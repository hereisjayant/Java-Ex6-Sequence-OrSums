package orsum;

import java.util.ArrayList;
import java.util.Collections;

public class TargetORSum {

    /**
     * Determine if one can select some elements of intArray and then obtain
     * target by performing bitwise OR operations on those elements
     *
     * @param intArray is not null and, if not empty, contains only values >= 0
     * @param target
     * @return true if one can select some elements of intArray and then obtain
     * target by performing bitwise OR operations on those elements, and
     * false otherwise. If intArray is empty then the default OR sum of
     * elements in the array is 0.
     */
    public static boolean isPossible(int[] intArray, int target) {
        ArrayList<Integer> inArr = new ArrayList<>();
        for (int i : intArray) {
            inArr.add(i);
        }
        Collections.sort(inArr);

        char[] target_bin = Integer.toBinaryString(target).toCharArray();

        for(int i: inArr){
            
        }

        return false; // change this
    }
    public static int getBit(int num, int pos) {
        return (num >> pos) & 1;
    }

}
