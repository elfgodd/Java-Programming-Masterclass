public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static boolean hasSharedDigit(int x, int y) {
        if ((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
            return false;
        } else {
            return ((x / 10 == y / 10) || (x / 10 == y % 10) || (y / 10 == x % 10) || (x % 10 == y % 10));
        }
    }

    // Another way to solve the challenge
    // public static boolean hasSharedDigit(int x, int y) {
    // if ((x < 10) || (x > 99) || (y < 10) || (y > 99)) {
    // return false;
    // } else {
    // int lastDigitOfX = x % 10;
    // int firstDigitOfX = x / 10;
    // int lastDigitOfY = y % 10;
    // int firstDigitOfY = y / 10;
    // if ((lastDigitOfX == lastDigitOfY) || (firstDigitOfX == firstDigitOfY)) {
    // return true;
    // } else if ((lastDigitOfX == firstDigitOfY) || (firstDigitOfX ==
    // lastDigitOfY)) {
    // return true;
    // } else {
    // return false;
    // }
    // }
    // }

    // Another way to solve the challenge
    // public static boolean hasSharedDigit(int num1, int num2) {

    // if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
    // return false;
    // }

    // int startNum2 = num2;
    // while (num1 > 0) {
    // int digitNum1 = num1 % 10;
    // num2 = startNum2;
    // while (num2 > 0) {
    // int digitNum2 = num2 % 10;
    // if (digitNum1 == digitNum2) {
    // return true;
    // }
    // num2 /= 10;
    // }
    // num1 /= 10;
    // }

    // return false;

    // }
}
