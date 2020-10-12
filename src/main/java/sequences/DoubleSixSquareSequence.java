package sequences;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleSixSquareSequence {
    /**
     * Return the n^th element of the Double-Six-Square Sequence
     *
     * @param n is the index of the element in the sequence to return; n >= 0
     * @return the n^th element of the Double-Six-Square Sequence
     */
    public static long get(int n) {
        ArrayList<Long> data = returnSeq(n);
        return data.get(n);
    }

    private static ArrayList<Long> returnSeq(int n) {
        ArrayList<Long> retList = new ArrayList<>();
        retList.add(1L);
        for (int i = 0; i < n; i++) {
            long element = retList.get(i);

            long x = 2L * element + 1L;
            long y = 6L * element;
            long z = element * element + 1L;

            if (!retList.contains(x)) {
                retList.add(x);
            }
            if (!retList.contains(y)) {
                retList.add(y);
            }
            if (!retList.contains(z)) {
                retList.add(z);
            }
            Collections.sort(retList);
        }
        System.out.println();
        return retList;
    }
}
