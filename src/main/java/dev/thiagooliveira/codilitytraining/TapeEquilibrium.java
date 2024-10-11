package dev.thiagooliveira.codilitytraining;

import java.util.Arrays;
public class TapeEquilibrium {

    public int solution(int[] a) {
        if (a.length < 2 || a.length > 100000) {
            throw new IllegalArgumentException("'N' is an integer within the range [2..100,000]");
        }
        if (Arrays.stream(a).filter(e -> e < -1000 || e > 1000).count() > 0) {
            throw new IllegalArgumentException("each element of array A is an integer within the range [−1,000..1,000]");
        }

        int target = Integer.MAX_VALUE;
        int p = 1;
        while (p < a.length - 1) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int i = 0; i < a.length; i++) {
                if (i < p) {
                    sumLeft += a[i];
                } else {
                    sumRight += a[i];
                }
            }
            int v = Math.abs(sumLeft - sumRight);
            if (v < target) {
                target = v;
            }
            p++;
        }

        return target;
    }

}
