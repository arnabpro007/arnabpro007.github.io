public class CodingExc2 {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }else {
            int rem = kiloBytes%1024;
            int megaBytes = (kiloBytes-rem)/1024;
            System.out.println(kiloBytes + " KB= "+megaBytes+ " MB and "+rem +" KB");
        }



    }
}
