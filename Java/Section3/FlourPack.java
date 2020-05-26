public class FlourPack {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));
    }
    public static boolean canPack(int bigCount , int smallCount , int goal){
        if(bigCount>= 0 && smallCount >= 0 && goal >= 0){
            while (goal >= 5){
                if (bigCount > 0){
                    bigCount = bigCount - 1;
                    goal = goal - 5;
                }else{
                    break;
                }


            }
            if (goal <= smallCount){
                return true;
            }else {
                return false;
            }




        }else{
            return false;
        }
    }
}

