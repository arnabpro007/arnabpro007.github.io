public class CodingExc7 {
    public static void main(String[] args) {
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(22,23,24));
        System.out.println(isTeen(13));
        System.out.println(isTeen(19));
        System.out.println(isTeen(22));
    }
    public static boolean hasTeen(int x , int y, int z){
        return (x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19);
    }
    public static boolean isTeen(int x){
        return (x >= 13 && x <= 19);
    }

}
