package tu.topacademy;

public class Automobile extends Device {
    Automobile() {
        setName("Tesla");
        setDescription("Самодвижущаяся повозка которой не нужен человек");
        setSound("жжжжжжжжжжжжж ...");
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
