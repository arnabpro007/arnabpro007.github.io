public class CodingExc1 {
    public static void main(String[] args) {
        double y = 75.114;
        System.out.println(toMilesPerHour(y));
        printConversion(y);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour<0){
            return -1;
        }else{
            double x =  (kilometersPerHour/1.609);
            return Math.round(x);
        }
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour<0){
            System.out.println("Invalid Value");
        }else {
            System.out.println(kilometersPerHour +" km/h = "+toMilesPerHour(kilometersPerHour) +" mi/h");
        }
    }
}

