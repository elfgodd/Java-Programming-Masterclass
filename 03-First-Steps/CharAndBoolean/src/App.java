public class App {
    public static void main(String[] args) throws Exception {
        
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        System.out.println("\n");
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        System.out.println("\n");
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        System.out.println("myTrueBooleanValue = " + myTrueBooleanValue);
        System.out.println("myFalseBooleanValue = " + myFalseBooleanValue);

        System.out.println("\n");
        boolean isCustomerOverTwentyOne = true;
        System.out.println("isCustomerOverTwentyOne = " + isCustomerOverTwentyOne);

    }
}
