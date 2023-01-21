package tu.topacademy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("Процессор",100,99);

        product2.showPrice();

        product1.declarePrice();
        product1.decreacePrice();
        product1.showPrice();
    }
}

