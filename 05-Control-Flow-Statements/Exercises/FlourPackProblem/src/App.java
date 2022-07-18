public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static class FlourPacker {
        public static boolean canPack(int bigCount, int smallCount, int goal) {
            if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) { // #1 validation
                return false;
            }

            while (bigCount > 0 && goal >= 5) { // #2 subtract 5 from goal for each bigCount
                goal -= 5;
                bigCount--;
            }
            return smallCount >= goal; // #3 make sure enough smallCount to fill remaining goal
        }
    }

    // Another way to solve the challenge
    // public class FlourPacker {
    // public static boolean canPack(int bigCount, int smallCount, int goal) {
    // if (bigCount < 0 || smallCount < 0 || goal < 0) { // #1 validation
    // return false;
    // }

    // int bigCountToUse = bigCount < goal / 5 ? bigCount : goal / 5; // #2
    // determine how many bigCount to use
    // return (goal - bigCountToUse * 5) <= smallCount; // #3 evaluate if enough
    // smallCount to fill the rest of the
    // // order
    // }
    // }

}
