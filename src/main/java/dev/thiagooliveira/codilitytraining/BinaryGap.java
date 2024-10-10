package dev.thiagooliveira.codilitytraining;

public class BinaryGap {
    public int solution(int n){
        if(n <= 0){
            throw new IllegalArgumentException("'n' should be positive number.");
        }
        String nBinary = Integer.toBinaryString(n);
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < nBinary.length(); i++) {
            char c = nBinary.charAt(i);
            if(c == '0'){
                count++;
            } else {
                if(maxCount < count){
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount;
    }
}
