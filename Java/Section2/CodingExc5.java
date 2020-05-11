public class CodingExc5 {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1752,-3.175));
        System.out.println(Math.floor(-3175.2%1000));
        System.out.println(Math.floor(-3175%1000));


    }
    public static boolean areEqualByThreeDecimalPlaces(double x , double y){
        if (Math.floor(x)==Math.floor(y)){
            x = x*1000;
            y = y*1000;
            if (x<0 && y<0){
                x = x*(-1);
                y = y*(-1);
            }


            return Math.floor(x%1000) == Math.floor(y%1000);
        }else {
            return false;
        }



    }
}
