package dev.thiagooliveira.codilitytraining;

import java.util.Arrays;

public class MaxCounters {

    public int[] solution(int n, int[] a) {
        if (n < 1 || a.length < 1 || n > 100000 || a.length > 100000) {
            throw new IllegalArgumentException("'N' and 'M' are integers within the range [1..100,000]");
        }
        if (Arrays.stream(a).filter(e -> e < 1 || e > n + 1).count() > 0) {
            throw new IllegalArgumentException("each element of array 'A' is an integer within the range [1..N + 1].");
        }
        int[] result = new int[n];
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 1 && a[i] <= n) {
                result[a[i] - 1]++;
                if (max < result[a[i] - 1]) {
                    max = result[a[i] - 1];
                }
            } else {
                for (int j = 0; j < result.length; j++) {
                    result[j] = max;
                }
            }
        }
        return result;
    }
}
