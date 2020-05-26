public class GCF {
    public static void main(String[] args) {
        System.out.println(getGreatestCommmonDivisor(9,18));
        printFactors(16);
    }
    public static int getGreatestCommmonDivisor(int a , int b){
        if (isValid(a) && isValid(b)){
            if (a == b){
                return a;
            }else if(a>b){
                int num = 1;
                for (int i = 1; i <=b ; i++) {
                    if (a%i ==0 && b%i==0){
                        num = i;
                    }
                }
                return num;
            }else {
                int num = 1;
                for (int i = 1; i <a ; i++) {
                    if (a%i == 0 && b%i ==0){
                        num = i;
                    }

                }
                return num;
            }
        }else{
            return -1;
        }
    }
    public static boolean isValid(int a){
        return a>=10;
    }

    public static void printFactors(int x){
        if(x>=1){
        for (int i = 1; i <= x/2; i++) {
            if (x%i ==0){
                System.out.println(i);
            }
        }
        System.out.println(x);

    }else{
            System.out.println("Invalid Value");
        }
    }

    public static boolean isPerfectNumber(int x){
        if (x>=1){
            int num = 0;
            for (int i = 1; i <=x/2 ; i++) {
                if (x%i == 0){
                    num = num + i ;
                }

            }
            return  (x == num) ;

        }else {
            return false;
        }
    }
}
