public class App {
    public static void main(String[] args) throws Exception {

    }

    public static class NumberInWord {
        public static void printNumberInWord(int No) {
            String[] NoWord = new String[] { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
                    "NINE" };
            System.out.println((No <= 9 && No >= 0) ? NoWord[No] : "other");
        }
    }

    // Long way
    //
    // public class NumberInWord {
    // public static void printNumberInWord(int num) {
    // String word = "OTHER";
    // switch (num) {
    // case 0:
    // word = "ZERO";
    // break;
    // case 1:
    // word = "ONE";
    // break;
    // case 2:
    // word = "TWO";
    // break;
    // case 3:
    // word = "THREE";
    // break;
    // case 4:
    // word = "FOUR";
    // break;
    // case 5:
    // word = "FIVE";
    // break;
    // case 6:
    // word = "SIX";
    // break;
    // case 7:
    // word = "SEVEN";
    // break;
    // case 8:
    // word = "EIGHT";
    // break;
    // case 9:
    // word = "NINE";
    // break;
    // }
    // System.out.println(word);
    // }
    // }
}
