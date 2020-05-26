public class printSquareStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int x){
        if (x<5){
            System.out.println("Invalid Value");
        }else{
            for (int i = 1; i <=x ; i++) {
                for (int j = 1; j <=x ; j++) {
                    if (i==1 || i ==x || i==j || j == x - i +1 || j==1 || j==x){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
