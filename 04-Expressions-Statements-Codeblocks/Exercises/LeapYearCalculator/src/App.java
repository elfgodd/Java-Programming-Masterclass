public class App {
    public static void main(String[] args) throws Exception {
        LeapYear.isLeapYear(2000);
    }

    public static class LeapYear {

        public static boolean isLeapYear(int year) {

            if (year >= 1 && year <= 9999) {
                if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
                    return true;
                }
                if (year % 4 != 0) {
                    return false;
                }
                return year % 100 != 0;
            } else {
                return false;
            }
        }
    }

    // Or the solution below with ternary operator:
    //
    // public class LeapYear {
    // public static boolean isLeapYear(int year) {
    // return year < 1 || year > 9999 ? false
    // : year % 4 == 0 ? year % 100 == 0 ? year % 400 == 0 ? true : false : true :
    // false;
    // }
    // }
}
