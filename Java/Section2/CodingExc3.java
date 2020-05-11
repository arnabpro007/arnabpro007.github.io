public class CodingExc3 {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,-1));
    }
    public static boolean shouldWakeUp(boolean state,int hour){
        if (state == true){
            if ((hour<8 && hour>=0) || (hour >22 && hour<=23)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }


}
