package dev.thiagooliveira.codilitytraining;

public class CountDiv {

    public int solution(int a, int b, int k) {
        if (a < 0 || b < 0 || a > 2000000000 || b > 2000000000) {
            throw new IllegalArgumentException("'A' and 'B' are integers within the range [0..2,000,000,000]");
        }
        if (k < 1 || k > 2000000000) {
            throw new IllegalArgumentException("'K' is an integer within the range [1..2,000,000,000];");
        }
        if (a > b) {
            throw new IllegalArgumentException("'A' ≤ 'B'");
        }
        int result = 0;
        while (a < b) {
            if (a % k == 0) {
                result++;
            }
            a++;
        }

        return result;
    }

}
