import java.lang.reflect.Array;

public class Dayoftheweek {
    public static void main(String[] args) {
        int x = 1;
        printDayoftheweek(x);
        printDayoftheweek(2);
        printDayoftheweek(3);
        printDayoftheweek(4);
        printDayoftheweek(5);
        printDayoftheweek(6);
        printDayoftheweek(0);
    }
    public static void printDayoftheweek(int day){

        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day!");
                break;
        }
    }
}
