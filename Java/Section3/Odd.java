public class Odd {
    public static void main(String[] args) {
        System.out.println(sumOdd(-1,100));
    }
    public static boolean isOdd(int n){
        if (n<0){
            return false;

        }else if (n%2 == 1){
            return true;
        }else {
            return false;
        }
    }
    public static int sumOdd(int a , int b){
        int sum = 0;
        if ((a>0)&&(b>0)&&(a<=b)){
        for (int i = a; i <=b ; i++) {
            if (isOdd(i)){
                sum = sum + i;
            }
        }
        }else {
            return -1;
        }
        return sum;
    }
}
