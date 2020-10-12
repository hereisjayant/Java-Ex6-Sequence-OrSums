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
        int new_target = 0;

        for (int i : inArr) {
            if (i <= target) {
                boolean orToTarget = true;
                for (int j = 0; j < noOfBits(i); j++) {
                    if ((getBit(i, j)==1) && (getBit(target, j) == 0)) {
                        orToTarget = false;
                        break;
                    }
                }
                if (orToTarget) {
                    new_target = new_target | i;
                }
            }

        }


        return target == new_target; // change this
    }

    public static int getBit(int num, int pos) {
        return (num >> pos) & 1;
    }

    public static int noOfBits(int val) {
        int count = 0;
        while (val > 0) {
            count++;
            val = val >> 1;
        }
        return count;
    }

}
