package tu.topacademy;

public class Ship extends Device {
    Ship() {
        setName("ПоБеда");
        setDescription("Большая лодка которая почему то ХОДИТ по воде а не плавает ¯\\_(ツ)_/¯");
        setSound("чух чух чух ...");
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
