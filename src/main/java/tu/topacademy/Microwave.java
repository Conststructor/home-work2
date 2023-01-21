package tu.topacademy;

import java.util.Dictionary;

public class Microwave extends Device {
    Microwave() {
        setName("LG");
        setDescription("Волшебная коробка для разогрева пищи ... и молний на фольге");
        setSound("бзззззззз ...");
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
