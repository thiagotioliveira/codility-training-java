package dev.thiagooliveira.codilitytraining;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    public int solution(int[] a){
        if(a.length > 1000000){
            throw new IllegalArgumentException("'a' length should not be more than 1000000.");
        }
        if(a.length % 2 == 0){
            throw new IllegalArgumentException("'a' length should have odd numbers of elements.");
        }
        if(Arrays.stream(a).filter(e -> e < 1 || e > 1000000000).count() > 0){
            throw new IllegalArgumentException("should not have exists elements less than 1 or more than 1000000000.");
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            Integer v = map.get(a[i]);
            if(v == null){
                v = 0;
            }
            map.put(a[i], ++v);
        }
        Map.Entry<Integer, Integer> entry = map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst().orElseThrow(IllegalStateException::new);
        return entry.getKey();
    }
}
