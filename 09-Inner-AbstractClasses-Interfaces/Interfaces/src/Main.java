public class Main {
    public static void main(String[] args) {
        ITelephone albsPhone;
        albsPhone = new DeskPhone(123456);
        albsPhone.powerOn();
        albsPhone.callPhone(123456);
        albsPhone.answer();

        System.out.println("\n");
        albsPhone = new MobilePhone(24561);
        // albsPhone.powerOn();
        albsPhone.callPhone(24561);
        albsPhone.answer();
    }
}
