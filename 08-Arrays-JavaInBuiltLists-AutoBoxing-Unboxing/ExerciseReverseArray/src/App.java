import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        int[] newArray = new int[] { 1, 2, 3, 4, 5 };
        System.out.println("The initial array is: " + Arrays.toString(newArray));
        reverse(newArray);
        System.out.println("The reversed array is: " + Arrays.toString(newArray));
    }

    private static void reverse(int[] array) { // pass in reference type variable pointing at the object in memory,
                                               // newArray...so we modify newArray via array
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}

// output
// The initial array is: [1, 2, 3, 4, 5]
// The reversed array is: [5, 4, 3, 2, 1]

/*
 * 2. Just for fun, here's the same approach using a while loop. It's a bit more
 * verbose since we have to explicitly increment and decrement with extra
 * variables, but this might be easier for some to follow and understand.
 */

// import java.util.Arrays;

// public class ReverseArray {
// private static void reverse(int[] array) {
// int first = 0; // index starts at 0
// int last = array.length - 1; // index starts at 0 so length -1 for last index

// System.out.println("Array = " + Arrays.toString(array));
// while (last > first) { // loop until the half way mark of the array, i.e.
// values get inverted
// int temp = array[first]; // hold the first value of target
// array[first] = array[last]; // change first value of target with last value
// array[last] = temp; // replace last value of target with temp value
// first++; // increment further into the array
// last--; // decrement further into the array
// }
// System.out.println("Reversed array = " + Arrays.toString(array));
// }
// }

/*
 * 3. But while loops are used typically when you don't know how many times to
 * loop. But since we are spelling out all the conditions, using a for loop will
 * make the code more concise and clear. This is a good example to use multiple
 * variables inside each for loop condition.
 */

// import java.util.Arrays;

// public class ReverseArray {
// private static void reverse(int[] array) {
// // int first = 0;
// // int last = array.length-1;

// System.out.println("Array = " + Arrays.toString(array));
// // while(last>first){
// for (int first = 0, last = array.length - 1; last > first; first++, last--) {
// int temp = array[first]; // hold the first value of target
// array[first] = array[last]; // change first value of target with last value
// array[last] = temp; // replace last value of target with temp value
// // first++;
// // last--;
// }
// System.out.println("Reversed array = " + Arrays.toString(array));
// }
// }