public class App {
    public static void main(String[] args) {
        System.out.println(BarkingDog.shouldWakeUp(true, 23));
    }

    public static class BarkingDog {
        public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
            if (!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
                return false;
            }
            return true;
        }
    }

}
