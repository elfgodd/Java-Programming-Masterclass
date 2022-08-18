public class App {
    public static void main(String[] args) {
        ITelephone albsPhone;
        albsPhone = new DeskPhone(123456);
        albsPhone.powerOn();
        albsPhone.callPhone(12345);
        albsPhone.answer();
    }
}
