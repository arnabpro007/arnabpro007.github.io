import java.util.Scanner;

public class ReadingInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int min = Integer.MAX_VALUE ;
        int max = Integer.MIN_VALUE ;
        while (count<=10){
            System.out.println("Enter the "+ count + " number: ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt == true) {
                int num = scanner.nextInt();
                sum = num + sum;
                count = count +1;
                if (num < min){
                    min= num;
                }

                if (num > max){
                    max = num;
                }
            }else{
                System.out.println("Error!");
            }
        }
        System.out.println("Total Sum is : "+ sum);
        System.out.println(" Min is : " + min);
        System.out.println(" Max is : " + max);



    }

}
