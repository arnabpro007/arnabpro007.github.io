public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sumDigits(11));
        System.out.println(sumFirstAndLastigit(1337));
    }
    public static int sumFirstAndLastigit(int x){
        if (x<0){
            return  -1;
        }else if (x<10){
            return 2*x;
        }else{
            int sum = 0;
            int num = 1;
            while (Math.pow(10,num)<= x){
                num ++;
            }
            String y = x+"too";
            sum = Integer.parseInt(String.valueOf(y.charAt(0))) + Integer.parseInt(String.valueOf(y.charAt(num-1)));
            return sum;
        }

    }
    private static int sumDigits(int n){
        if (n<10){
            return -1;
        }else{
            int sum = 0;
            int num = 1;
            while (Math.pow(10,num)<= n){
                num ++;
            }
            for (int i = 1; i <= num; i++) {
                int r = 0;
                r = (int) (n % Math.pow(10,i));
                sum = (int) (sum + r/Math.pow(10,i-1));
                n = n - r;
            }



            return sum;
        }
    }

}
