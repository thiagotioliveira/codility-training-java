package dev.thiagooliveira.codilitytraining;

public class FrogJmp {

    public int solution(int x, int y, int d){
        if(x < 1 || x > 1000000000){
            throw new IllegalArgumentException("x should be between [1..1,000,000,000]");
        }
        if(y < 1 || y > 1000000000){
            throw new IllegalArgumentException("y should be between [1..1,000,000,000]");
        }
        if(d < 1 || d > 1000000000){
            throw new IllegalArgumentException("d should be between [1..1,000,000,000]");
        }
        if(x > y){
            throw new IllegalArgumentException("x should be less or equals y");
        }
        int jumps = 0;
        while(x < y) {
            x += d;
            jumps++;
        }
        return jumps;
    }

}
