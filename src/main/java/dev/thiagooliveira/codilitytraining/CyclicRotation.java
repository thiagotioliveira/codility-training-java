package dev.thiagooliveira.codilitytraining;

import java.util.Arrays;

public class CyclicRotation {

    public int[] solution(int[] a, int k) {
        if (a.length > 100 || k < 0 || k > 100) {
            throw new IllegalArgumentException("'a.length' and 'k' should be between [0..100]");
        }
        if (Arrays.stream(a).filter(i -> i < -1000 || i > 1000).count() > 0) {
            throw new IllegalArgumentException("'a' should have elements between [-1000..1000]");
        }
        if (k == 0 || k == a.length || k % a.length == 0) {
            return a;
        }
        int[] copyOfArray = Arrays.copyOf(a, a.length);
        int step = 0;
        while (step < k) {
            int e = copyOfArray[0];
            for (int i = 0; i < copyOfArray.length; i++) {
                if (i + 1 < copyOfArray.length) {
                    int temp = copyOfArray[i + 1];
                    copyOfArray[i + 1] = e;
                    e = temp;
                } else {
                    copyOfArray[0] = e;
                }
            }
            step++;
        }
        return copyOfArray;
    }
}
