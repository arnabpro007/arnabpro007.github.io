public class getEvendigitSum {
    public static void main(String[] args) {
        System.out.println(getEvendigit(1226));
    }
    public static int getEvendigit(int x){

        if (x<0){
            return  -1;
        }else{
            int sum = 0;
            int num = 1;
            while (Math.pow(10,num)<= x){
                num ++;
            }
            for (int i = 1; i <= num; i++) {
                int r = 0;
                r = (int) (x % Math.pow(10,i));
                int z = (int) (r/Math.pow(10,i-1));
                if (z%2 == 0){
                sum = (int) (sum + z);
                x = x - r;
                }else {
                    x = x-r;
                }
            }
            return sum;
        }

    }
}
