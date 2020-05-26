public class sharedigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(25,1));
        System.out.println(hasSameLastDigit(71,10,11));
    }
    public static boolean hasSameLastDigit(int a , int b , int c){
        if (a<=1000 && b<=1000 && c<=1000 && a>=10 && b >=10 && c>=10){
            int a1 = a%10;
            int b1 = b%10;
            int c1 = c%10;
            if (a1==b1||b1==c1||c1==a1){
                return true;
            }else {
                return false;
            }

        }else {
            return false;
        }
    }
    public static boolean hasSharedDigit(int x, int y){
        if (x<=99 && y <=99 && x>=10 && y >= 10 ){
            int x1 = x%10;
            int y1 = y%10;
            int x2 = (x - x1)/10;
            int y2 = (y-y1)/10;
            if (x1 == y1 || x1 ==y2|| x2 ==y1 || x2 == y2){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }
}
