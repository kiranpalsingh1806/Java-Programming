public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        if(isTeen(a) || isTeen(b) || isTeen(c)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int x) {
        if(x >= 13 && x <= 19) {
            return  true;
        } else {
            return  false;
        }
    }
}
