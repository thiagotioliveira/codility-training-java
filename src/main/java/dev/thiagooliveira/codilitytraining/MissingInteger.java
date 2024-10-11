package dev.thiagooliveira.codilitytraining;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingInteger {

    public int solution(int[] a) {
        if (a.length < 1 || a.length > 100000) {
            throw new IllegalArgumentException("'N' is an integer within the range [1..100,000]");
        }
        if (Arrays.stream(a).filter(e -> e < -1000000 || e > 1000000).count() > 0) {
            throw new IllegalArgumentException("each element of array 'A' is an integer within the range [−1,000,000..1,000,000]");
        }
        Set<Integer> values = new TreeSet<>();
        values.addAll(Arrays.asList(Arrays.stream(a).boxed().toArray(Integer[]::new)));
        int i = 1;
        int result = a.length + 1;
        for (Integer v : values) {
            if (i != v) {
                result = i;
                break;
            }
            i++;
        }
        return result;
    }

}
