public class Number2Word {
    public static void main(String[] args) {
        System.out.println(getDigitCount(-3));
        System.out.println(reverse(1000));
        System.out.println(getDigitCount(0));

        numberToWords(0);

    }

    public static int getDigitCount(int x) {
        int r = 0;
        if (x < 0) {
            return -1;
        } else {
            do {
                r = r + 1;
            }
            while (x >= Math.pow(10, r));
            return r;

        }
    }

    public static int reverse(int x) {
        int y;
        if (x < 0) {
            y = -x;
        }else{
            y  = x;
        }
        int n = getDigitCount(y);
        int t = 0;
        int i = 0;
        int z = y;
        if (y%Math.pow(10,n) == 0){
            t = (int) (y/Math.pow(10,n));

        }else {
            while (y>=Math.pow(10,i)){
                int r = z%10;
                t  = (int) (t + r*Math.pow(10,n-1-i));
                z=(z-r)/10;


                i++;
            }
        }

        if (x<0){
            return -t;
        }else {
            return t;
        }


    }
    public static void numberToWords(int x){
        int y = reverse(x);
        if (x<0){
            System.out.println("Invalid Value");
        }else {
            int n = getDigitCount(y);
            int j = getDigitCount(x);
            if (x == 0) {
                System.out.println("Zero");
            } else {
                for (int i = 1; i <= n; i++) {
                    int r = 0;
                    r = (int) (y % Math.pow(10, i));
                    y = y - r;
                    r = (int) (r / Math.pow(10, i - 1));

                    switch (r) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;

                    }

                }
                int l = j - n;
                for (int i = 1; i <= l; i++) {
                    System.out.println("Zero");
                }
                if (x % Math.pow(10, j) == 0) {
                    System.out.println("Zero");
                }
            }
        }
    }
}