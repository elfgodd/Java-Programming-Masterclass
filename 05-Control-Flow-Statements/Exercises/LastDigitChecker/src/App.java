public class App {
    public static void main(String[] args) throws Exception {

    }

    public static class LastDigitChecker {
        public static boolean isValid(int num) {
            return (num > 9) && (num < 1001);
        }

        public static boolean hasSameLastDigit(int a, int b, int c) {
            if (isValid(a) && isValid(b) && isValid(c)) {
                a %= 10;
                b %= 10;
                c %= 10;
                return (a == b) || (a == c) || (b == c);
            }
            return false;
        }
    }

    // Another way to solve the challenge
    // public class LastDigitChecker {
    // // write your code here
    // public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree)
    // {
    // if ((numOne < 10 || numOne > 1000) || (numTwo < 10 || numTwo > 1000)
    // || (numThree < 10 || numThree > 1000)) {
    // return false;
    // }

    // int numOneLastDig = numOne % 10;
    // int numTwoLastDig = numTwo % 10;
    // int numThreeLastDig = numThree % 10;

    // if ((numOneLastDig == numTwoLastDig) || (numOneLastDig == numThreeLastDig) ||
    // (numTwoLastDig ==
    // numThreeLastDig)) {
    // return true;
    // }
    // else
    // return false;
    // }
    // public static boolean isValid(int validNumber) {
    // return validNumber >= 10 && validNumber <= 1000;
    // }
    // }
}
