public class Main {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        System.out.println("\n");
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        // float myFloatValue = 5.25; // Type mismatch: cannot convert from double to
        // float

        // Long way to convert float to float
        // float myFloatValue = (float) 5.25;
        System.out.println("\n");
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;
        System.out.println("float myFloatValue = 5.25f " + myFloatValue);
        System.out.println("double myDoubleValue = 5.25d " + myDoubleValue);

        System.out.println("\n");
        int myIntValue2 = 5;
        float myFloatValue2 = 5f;
        double myDoubleValue2 = 5d;
        System.out.println("MyIntValue2 = " + myIntValue2);
        System.out.println("MyFloatValue2 = " + myFloatValue2);
        System.out.println("MyDoubleValue2 = " + myDoubleValue2);

        System.out.println("\n");
        myIntValue2 = 5 / 2;
        myFloatValue2 = 5f / 2;
        myDoubleValue2 = 5d / 2;
        System.out.println("MyIntValue2 = " + myIntValue2);
        System.out.println("MyFloatValue2 = " + myFloatValue2);
        System.out.println("MyDoubleValue2 = " + myDoubleValue2);

        System.out.println("\n");
        myIntValue2 = 5 / 3;
        myFloatValue2 = 5f / 3;
        myDoubleValue2 = 5d / 3;
        System.out.println("MyIntValue2 = " + myIntValue2);
        System.out.println("MyFloatValue2 = " + myFloatValue2);
        System.out.println("MyDoubleValue2 = " + myDoubleValue2);

        System.out.println("\n");
        myDoubleValue2 = 5.00 / 3.00;
        System.out.println("MyDoubleValue2 = " + myDoubleValue2);

        System.out.println("\n");
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        System.out.println("\n");
        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println("pi = " + pi);
        System.out.println("anotherNumber = " + anotherNumber);
    }
}
