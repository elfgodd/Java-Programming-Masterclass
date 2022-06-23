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
    System.out.println(myMaxIntTest3); // 2147483647

    System.out.println("\n");
    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Minimum Value = " + myMinByteValue);
    System.out.println("Byte Maximum Value = " + myMaxByteValue);

    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Minimum Value = " + myMinShortValue);
    System.out.println("Short Maximum Value = " + myMaxShortValue);

    long myLongValue = 100L;    
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Minimum Value = " + myMinLongValue);
    System.out.println("Long Maximum Value = " + myMaxLongValue);

    System.out.println("\n");
    long bigLongLiteralValue = 2_147_483_647_234L;
    System.out.println("bigLongLiteralValue = " + bigLongLiteralValue);

    // short bigShortLiteralValue = 32768; // Error: Type mismatch: cannot convert from int to short
    short bigShortLiteralValue = 32767; 

    }
}