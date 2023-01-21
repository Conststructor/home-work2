package tu.topacademy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Teapot t1 = new Teapot();
        Microwave m1 = new Microwave();
        Automobile a1 = new Automobile();
        Ship s1 = new Ship();

        t1.show();
        t1.desc();
        t1.sound();
        System.out.println("----------------------");
        m1.show();
        m1.desc();;
        m1.sound();
        System.out.println("----------------------");
        a1.show();
        a1.desc();
        a1.sound();
        System.out.println("----------------------");
        s1.show();
        s1.desc();
        s1.sound();
    }
}

