public class Sum {
    public static void main(String[] args) {
        int sum1 = 0;
        int m = 0;
        for (int i = 1; i <=100 ; i++) {
            if (m<5){
            if ((i%3 == 0) && (i%5 == 0)){
                sum1 = sum1 + i;
                System.out.println(i+ " meets the 3 and 5 condition");
                m = m+1;
            }

            }else {
                break;
            }
        }
        System.out.println(sum1 + " is the total sum");
    }
}
