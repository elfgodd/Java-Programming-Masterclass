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
        // float myFloatValue = 5.25; // Type mismatch: cannot convert from double to float
        
        // Long way to convert float to float
        // float myFloatValue = (float) 5.25;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;
    }
}
