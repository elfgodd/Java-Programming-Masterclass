public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static class EqualSumChecker {
        public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
            if (firstNumber + secondNumber == thirdNumber) {
                return true;
            } else {
                return false;
            }
        }
    }

    // Another shorter way
    //
    // public class EqualSumChecker {
    // public static boolean hasEqualSum(int num1, int num2, int num3) {
    // return num1 + num2 == num3;
    // }
    // }
}
