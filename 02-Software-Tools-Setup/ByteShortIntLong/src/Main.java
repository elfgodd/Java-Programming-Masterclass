public class Main {
  public static void main(String[] args) {
    System.out.println("ByteShortIntLong File");

    System.out.println("\n");
    int myValue = 10000;

    int myMinIntValue = Integer.MIN_VALUE;
    int myMaxIntValue = Integer.MAX_VALUE;
    System.out.println("myValue = " + myValue);
    System.out.println("Integer Minimum Value = " + myMinIntValue);
    System.out.println("Integer Maximum Value = " + myMaxIntValue);
    System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // <--- overflowed
    System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // <--- underflow

    // int myMaxIntTest1 = 2147483648; // The literal 2147483647of type int is out of range
    // int myMaxIntTex2 = -2147483649; // The literal 2147483647of type int is out of range

    System.out.println("\n");
    // Another way to print numbers to read them better
    int myMaxIntTest3 = 2_147_483_647;
    System.out.println(myMaxIntTest3);
    }
}