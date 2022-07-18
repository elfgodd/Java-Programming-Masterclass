public class App {
    public static void main(String[] args) throws Exception {

    }

    public static class GreatestCommonDivisor {

        public static int getGreatestCommonDivisor(int first, int second) {

            if (first < 10 || second < 10) {
                return -1;
            }
            while (first != second) {
                if (first > second)
                    first = first - second;
                else {
                    second = second - first;
                }
            }
            return second;
        }
    }

    // Another way to solve the challenge
    // public class GreatestCommonDivisor {

    // public static int getGreatestCommonDivisor(int num1, int num2) {

    // if (num1 < 10 || num2 < 10) {
    // return -1;
    // }

    // int biggestNumber = num1 > num2 ? num1 : num2;
    // int smallestNumber = num1 > num2 ? num2 : num1;
    // int divisor = smallestNumber;

    // while (divisor > 0) {
    // if (biggestNumber % divisor == 0 && smallestNumber % divisor == 0) {
    // return divisor;
    // }
    // divisor--;

    // }
    // return 0;
    // }
    // }
}
