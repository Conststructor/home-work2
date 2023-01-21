package tu.topacademy;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Ukulele u1 = new Ukulele();
        Trombon t1 = new Trombon();
        Skripka s1 =new Skripka();
        Violonchel v1 = new Violonchel();

        u1.show();
        u1.desc();
        u1.history();
        u1.sound();
        System.out.println("--------------------------------");
        t1.show();
        t1.desc();
        t1.history();
        t1.sound();
        System.out.println("--------------------------------");
        s1.show();
        s1.desc();
        s1.history();
        s1.sound();
        System.out.println("--------------------------------");
        v1.show();
        v1.desc();
        v1.history();
        v1.sound();
    }
}

