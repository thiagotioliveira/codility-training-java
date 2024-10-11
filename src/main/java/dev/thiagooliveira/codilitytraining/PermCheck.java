package dev.thiagooliveira.codilitytraining;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PermCheck {

    public int solution(int[] a) {
        if (a.length < 1 || a.length > 100000) {
            throw new IllegalArgumentException("'N' is an integer within the range [1..100,000]");
        }
        if (Arrays.stream(a).filter(e -> e < 1 || e > 1000000000).count() > 0) {
            throw new IllegalArgumentException("each element of array A is an integer within the range [1..1,000,000,000]");
        }

        Set<Integer> values = new TreeSet<>();
        values.addAll(Arrays.asList(Arrays.stream(a).boxed().toArray(Integer[]::new)));

        boolean ok = true;
        int i = 1;
        for (Integer v : values) {
            if (i != v) {
                ok = false;
                break;
            }
            i++;
        }
        return ok ? 1 : 0;
    }

}
