public class getDurationString {
    public static void main(String[] args) {
        System.out.println(getDurationString(62,32));
    }
    public static String getDurationString(int x, int y){
        if (x<0 || (y<0 || y>59)){
            return ("Invalid Value");
        }else{
            int rem1 = x%60;
            int hour = (x-rem1)/60;
            String m = "";
            if(rem1<10){
                m = "0";
            }
            String s = "";

            if (y<10){
                s="0";
            }



            return (hour + "h "+ m+rem1+"m "+s+y+"s");
        }
    }
}
