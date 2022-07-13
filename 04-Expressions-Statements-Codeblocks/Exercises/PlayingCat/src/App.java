public class App {
    public static void main(String[] args) throws Exception {

    }

    public static class PlayingCat {
        private static final int TWENTY_FIVE = 25;
        private static final int THIRTY_FIVE = 35;
        private static final int FORTY_FIVE = 45;

        public static boolean isCatPlaying(boolean summer, int temperature) {
            if ((temperature >= TWENTY_FIVE && temperature <= THIRTY_FIVE)
                    || ((temperature >= 25 && temperature <= FORTY_FIVE) && summer)) {
                return true;
            } else {
                return false;
            }
        }
    }
}
