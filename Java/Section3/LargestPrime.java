public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(0));
    }
    public static int getLargestPrime(int x){
        if (x <= 1){
            return -1;
        }else{
            int p = 0;
            for (int i = 2; i <=x ; i++) {
                if (x%i == 0){
                    int m = 0;
                    for (int j = 2; j <= i/2 ; j++) {
                        if (i%j == 0){
                            m = m +1;
                        }
                    }
                if (m == 0){
                    p = i;
                }
                }
            }
            return p;
        }
    }
}
