public class SpeedConverter {

    public static void main(String[] args) {
        printConversion(95.75);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) return -1;

        double distance = Math.round(kilometersPerHour / 1.609);
        return Double.valueOf(distance).longValue();
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            System.out.println("Invalid value");
        } else {
            long result = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + result +  " mi/h");
        }
    }
}
