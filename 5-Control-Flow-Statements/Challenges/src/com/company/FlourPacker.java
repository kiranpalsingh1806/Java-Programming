package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if(goal >= bigCount * 5) {
            goal %= (bigCount * 5);
        } else if(goal < bigCount * 5) {
            goal %= 5;
        }

        if(goal > smallCount) {
            return false;
        } else if(goal <= smallCount) {
            return true;
        }

        if(goal == 0) {
            return true;
        } else {
            return false;
        }
    }
}
