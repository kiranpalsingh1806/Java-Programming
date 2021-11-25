public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNo, double secondNo) {

        int first = (int)(firstNo * 1000);
        int second = (int)(secondNo * 1000);

        if(first == second) {
            return  true;
        } else {
            return false;
        }
    }
}
