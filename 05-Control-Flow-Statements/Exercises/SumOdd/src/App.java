public class App {
    public static void main(String[] args) throws Exception {

    }

    // Long way
    public static class SumOddRange {

        public static boolean isOdd(int number) {
            if (number <= 0) {
                return false;
            }
            return number % 2 != 0;
        }

        public static int sumOdd(int start, int end) {
            if ((end < start) || (start < 0) || (end < 0)) {
                return -1;
            }
            int sum = 0;

            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    // Short way
    // public static class SumOddRange {
    // public static boolean isOdd(int number) {
    // return number > 0 && number % 2 != 0;
    // }

    // public static int sumOdd(int start, int end) {
    // int sum = 0;
    // for (int i = isOdd(start) ? start : start + 1; i <= end; i += 2)
    // sum += i;
    // return (start < 0 || start > end ? -1 : sum);
    // }
    // }
}
