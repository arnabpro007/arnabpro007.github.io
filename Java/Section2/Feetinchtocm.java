public class Feetinchtocm {
    public static void main(String[] args) {
        System.out.println(Convo(6,1));
        System.out.println(Convo(73));
    }
    public static double Convo(int x , int y){
        if (x<0 || (y<0||y>12)){
            return -1;
        }else{
            double val = (12*x+y)*2.54;
            return val;
        }
    }
    public static double Convo(int x){
        if (x<0){
            return -1;
        }else{
            double val = x*2.54;
            return val;
        }
    }
}
