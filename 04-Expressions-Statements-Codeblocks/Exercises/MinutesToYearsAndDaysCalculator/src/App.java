public class App {
    public static void main(String[] args) throws Exception {

    }

    public static class MinutesToYearsDaysCalculator {
        public static void printYearsAndDays(long minutes) {
            if (minutes < 0) {
                System.out.println("Invalid Value");
            } else {
                long days = ((int) minutes / 60) / 24;
                long years = (int) days / 365;
                long remainingDays = (int) days % 365;
                System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
            }
        }
    }
}
