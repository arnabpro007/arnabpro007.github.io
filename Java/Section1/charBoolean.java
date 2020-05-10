public class charBoolean {
    public static void main(String[] args){
        char mychar = 'A';
        char myUnicodeChar = '\u0044';
        System.out.println(mychar);
        System.out.println(myUnicodeChar);
        boolean x = true;
        System.out.println(x);

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + " Interessting";
        System.out.println(myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(
                numberString
        );
        int myint = 3;
        numberString = numberString+myint;
        System.out.println(numberString);
    }
}
