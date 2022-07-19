public class App {
    public static void main(String[] args) throws Exception {

    }

    public class Person {
        private String firstName;
        private String lastName;
        private int age = 0;

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            // if(age<0 || age>100) this.age=0;
            // this.age=age;
            this.age = (age < 0 || age > 100) ? 0 : age; // ternary operator
        }

        public boolean isTeen() {
            // if(age>12 && age<20) return true;
            // return false;
            return (age > 12 && age < 20); // ternary operator only in function but doesn't write out the ? true :
                                           // false;
        }

        public String getFullName() {
            // if(firstName.isEmpty() && lastName.isEmpty()) return "";
            // if(firstName.isEmpty()) return lastName;
            // if(lastName.isEmpty()) return firstName;
            // return firstName + " " + lastName;
            return (firstName.isEmpty() && lastName.isEmpty()) ? ""
                    : (firstName.isEmpty()) ? lastName : (lastName.isEmpty()) ? firstName : firstName + " " + lastName; // ternary
                                                                                                                        // operator
        }
    }

    // Another way to solve the challenge
    // public class Person {

    // /*
    // * public static void main(String[] args) {
    // * //comment main
    // * Person person = new Person();
    // * person.setFirstName(""); // firstName is set to empty string
    // * person.setLastName(""); // lastName is set to empty string
    // * person.setAge(10);
    // * System.out.println("fullName= " + person.getFullName());
    // * System.out.println("teen= " + person.isTeen());
    // * person.setFirstName("John"); // firstName is set to John
    // * person.setAge(18);
    // * System.out.println("fullName= " + person.getFullName());
    // * System.out.println("teen= " + person.isTeen());
    // * person.setLastName("Smith"); // lastName is set to Smith
    // * System.out.println("fullName= " + person.getFullName());
    // * }
    // */

    // private String firstName;
    // private String lastName;
    // private int age;

    // // instance methods

    // // set method
    // public void setFirstName(String firstName) { // METHOD-1
    // this.firstName = firstName;
    // }

    // public void setLastName(String lastName) { // METHOD-2
    // this.lastName = lastName;
    // }

    // public void setAge(int age) { // METHOD-3
    // this.age = age;
    // if (age < 0 || age > 100) {
    // this.age = 0;
    // } else {
    // this.age = age;
    // }
    // }

    // // get method
    // public String getFirstName() { // METHOD-1 : getMethod
    // return this.firstName;
    // }

    // public String getLastName() { // METHOD-2 : getMethod
    // return this.lastName;
    // }

    // public int getAge() { // METHOD-3 : getMethod
    // return this.age;
    // }

    // // METHOD-4
    // public boolean isTeen() {
    // return (this.age > 12 && this.age < 20); // returns true
    // }

    // // METHOD-5
    // public String getFullName() {
    // if (this.firstName.isEmpty() && this.lastName.isEmpty()) {
    // return "";
    // } else if (this.firstName.isEmpty()) {
    // return lastName;
    // } else if (this.lastName.isEmpty()) {
    // return firstName;
    // }
    // return firstName + " " + lastName;
    // }
    // }
}
