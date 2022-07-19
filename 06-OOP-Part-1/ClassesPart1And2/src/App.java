public class App {
    public static void main(String[] args) throws Exception {

        // Created a new DataType call porsche of type Car, base on the template Car
        Car porsche = new Car();
        Car holden = new Car();

        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());

    }

}
