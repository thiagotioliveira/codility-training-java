package dev.thiagooliveira.codilitytraining;

import java.util.Set;
import java.util.TreeSet;

public class PermMissingElem {

    public int solution(int[] a) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }

        int count = 1;
        int result = -1;
        for (Integer e : set) {
            if (count != e) {
                result = count;
                break;
            }
            count++;
        }
        return result;
    }

}
