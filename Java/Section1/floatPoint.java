public class floatPoint {

    public static void main(String[] args){

        float myminfloat = Float.MIN_VALUE;
        float mymaxfloat = Float.MAX_VALUE;
        System.out.println("My min Float = " + myminfloat);
        System.out.println("My max Float = "+ mymaxfloat);
        double mymindouble = Double.MIN_VALUE;
        double mymaxdouble = Double.MAX_VALUE;
        System.out.println("My min Double = " + mymindouble);
        System.out.println("My max Double = "+ mymaxdouble);

        float myFloatValue = (float) 5.35;
        int myintValue = 5;
        double myDoubleValue = 5.35d;
        System.out.println(myDoubleValue+myFloatValue+myintValue);
        System.out.println(myDoubleValue/myFloatValue);

    }


}
