public class App {
    public static void main(String[] args) {

    }

    public static class PerfectNumber {
        // write your code here
        public static boolean isPerfectNumber(int number) {

            int sumOfProperDivisors = 0;

            for (int i = 1; i < number; i++)
                if (number % i == 0)
                    sumOfProperDivisors += i;

            return sumOfProperDivisors == number && number > 1;

        }
    }

    // Another way to solve the challenge
    // public static boolean isPerfectNumber(int number) {

    // int sumOfProperDivisors = 0;
    // int increment = (number % 2 == 0) ? 1 : 2;

    // for (int i = 1; i <= number / 2; i += increment)
    // if (number % i == 0)
    // sumOfProperDivisors += i;

    // return sumOfProperDivisors == number && number > 1;
    // }
}