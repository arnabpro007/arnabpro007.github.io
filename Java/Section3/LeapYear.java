public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(2100));
        System.out.println(isLeapYear(2020));
        System.out.println(DaysInMonth(2,2012));
    }
    public static boolean isLeapYear(int year){
        int  x = 9;
        int rem1 = year%4;
        int rem2 = year%100;
        int rem3 = year%400;
        boolean y1,y2;
        y1 = rem3==0;
        y2 = (rem1 == 0)&& (rem2 != 0);
        if (year>=0 && year <=9999){
        if(y1){
            x = 1;
        }else if (y2){
            x = 1;
        }else {
            x = 0;
        }
        }else {
            x = 0;
        }
        switch (x){

            case 1:
                return true;
            default:
                return false;
        }
    }
    public static int DaysInMonth(int month , int year){
        boolean x = isLeapYear(year);
        if (x ){
            switch (month){
                case 1:
                    return 31;

                case 2:
                    return 29;

                case 3:
                    return 31;

                case 4:
                    return 30;

                    case 5:
                    return 31;

                    case 6:
                    return 30;

                    case 7:
                    return 31;

                    case 8:
                    return 31;

                    case 9:
                    return 30;

                    case 10:
                    return 31;

                    case 11:
                    return 30;

                case 12:
                    return 31;

                default:
                    return -1;
            }
        }else {
            if (year>=0 && year<=9999){

                    switch (month){
                        case 1:
                            return 31;

                        case 2:
                            return 28;

                        case 3:
                            return 31;

                        case 4:
                            return 30;

                        case 5:
                            return 31;

                        case 6:
                            return 30;

                        case 7:
                            return 31;

                        case 8:
                            return 31;

                        case 9:
                            return 30;

                        case 10:
                            return 31;

                        case 11:
                            return 30;

                        case 12:
                            return 31;

                        default:
                            return -1;


                    }

            }else{
                return -1;
            }
        }
    }
}
