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

        System.out.println("\n");
        Account josueAccount = new Account("Josue", "josue@mail.com", "12345");
        System.out.println(
                josueAccount.getNumber()
                        + " name "
                        + josueAccount.getCustomerName()
                        + " "
                        + josueAccount.getCustomerEmailAddress()
                        + "Current balance is " + josueAccount.getBalance());
        josueAccount.withdrawal(100.55);
        System.out.println("josueAccount Balance = " + josueAccount.getBalance());

        System.out.println("\n");
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName() + " " + person1.getEmailAddress());

        VipPerson person2 = new VipPerson("Consuelo", 25000.00);
        System.out.println(person2.getName() + " " + person2.getEmailAddress());

        VipPerson person3 = new VipPerson("Beto", 100.00, "beto@email.com");
        System.out.println(person3.getName() + " " + person3.getEmailAddress());
    }
}
