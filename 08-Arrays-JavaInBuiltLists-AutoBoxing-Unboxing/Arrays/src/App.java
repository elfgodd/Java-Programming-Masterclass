public class App {
    public static void main(String[] args) throws Exception {
        int[] myIntArray = new int[10];
        myIntArray[0] = 50;
        System.out.println(myIntArray);
        System.out.println(myIntArray[0]);
        myIntArray[1] = 71;
        myIntArray[2] = 12;

        System.out.println("\n");
        double[] myDoubleArray = new double[10];
        myDoubleArray[0] = 100;
        System.out.println(myDoubleArray);
        System.out.println(myDoubleArray[0]);

        System.out.println("\n");
        int[] arrayShortCut = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(arrayShortCut);

        System.out.println("\n");
        int[] forLoopArray = new int[5];
        for (int i = 0; i < forLoopArray.length; i++) {
            forLoopArray[i] = i * 10;
        }
        for (int i = 0; i < forLoopArray.length; i++) {
            System.out.println("forLo´Array: Element " + i + ", value is " + forLoopArray[i]);
        }

        System.out.println("\n");
        // for (int i = 0; i < forLoopArray.length; i++) {
        // forLoopArray[i] = i * 10;
        // }
        printArray(forLoopArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("printArray: Element " + i + ", value is " + array[i]);
        }
    }
}
