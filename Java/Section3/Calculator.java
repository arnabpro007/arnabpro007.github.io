import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int SUM = 0;
        long AVG = 0;
        int count = 0;
        while (true){
            System.out.println();
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt == true){
                int num = scanner.nextInt();
                SUM = SUM + num;
                count = count + 1;
                AVG = Math.round(SUM/count);
            }else{
                System.out.println("SUM = "+ SUM + " AVG = "+ AVG);
                break;
            }
        }
    }
}
