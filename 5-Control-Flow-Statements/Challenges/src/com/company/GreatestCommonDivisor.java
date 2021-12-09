package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first < 10 || second < 10) {
            return -1;
        }

        int gcd = 1;
        int answer = 1;

        while(gcd <= Integer.min(first, second)) {
            if(first % gcd == 0 && second % gcd == 0) {
                answer = Integer.max(answer, gcd);
            }
            gcd++;
        }
        return answer;
    }
}
