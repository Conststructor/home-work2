package tu.topacademy;

public class Teapot extends Device {
    Teapot() {
        setName("Tefal");
        setDescription("Чайник для кипячения воды");
        setSound("буль буль буль ...");
    }

    public void sound() {
        System.out.println(getSound());
    }

    public void show() {
        System.out.println(getName());
    }

    public void desc() {
        System.out.println(getDescription());
    }
}
