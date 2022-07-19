public class App {
    public static void main(String[] args) throws Exception {

        Account albertAccount = new Account(
                "12345",
                0.00,
                "Alberto Guzman",
                "albetogx@mail.com",
                "(507)-123-4567");

        // albertAccount.setNumber("12345");
        // albertAccount.setBalance(0.00);
        // albertAccount.setCustomerName("Alberto Guzman");
        // albertAccount.setCustomerEmailAddress("albertogx@mail.com");
        // albertAccount.setCustomerPhoneNumber("(507)-123-4567");

        System.out.println("albertAccount Number = " + albertAccount.getNumber());
        System.out.println("albertAccount Balance = " + albertAccount.getBalance());

        System.out.println("albertAccount = " + albertAccount);

        albertAccount.withdrawal(100.0);

        albertAccount.deposit(50);
        albertAccount.withdrawal(100.0);

        albertAccount.deposit(51);
        albertAccount.withdrawal(100.0);

        System.out.println("\n");
        Account yarelisAccount = new Account();
        System.out.println(yarelisAccount.getNumber());
        System.out.println(yarelisAccount.getBalance());
    }
}
