public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }
    public static boolean isPalindrome(int x){
        if (x<10 && x>-10){
            return true;
        }else{
        if (x>=10){
        int num = 1;
        int s = x;
        while (Math.pow(10,num)<=x){
            num ++;
        }
        int y = 0;
            for (int i = 1; i <=num ; i++) {
                int r = 0;
                r = (int) (x % Math.pow(10,i));
                x= x-r;
                r = (int) (r/Math.pow(10,i-1));

                y = y + (int) Math.pow(10,num-i)*r;

            }

            return s==y;
    }else {
            x = x*-1;
            int s = x;
            int num = 1;
            while (Math.pow(10,num)<=x){
                num ++;
            }
            int y = 0;
            for (int i = 1; i <=num ; i++) {
                int r = 0;
                r = (int) (x % Math.pow(10,i));
                x= x-r;
                r = (int) (r/Math.pow(10,i-1));

                y = y + (int) Math.pow(10,num-i)*r;

            }

            return s==y;
        }
    }
    }
}
