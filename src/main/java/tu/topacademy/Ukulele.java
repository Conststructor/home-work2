package tu.topacademy;

public class Ukulele extends MusicalInstrument{
    Ukulele() {
        this.setName("Укулеле");
        this.setDescription("Гавайская четырёхструнная разновидность гитары");
        this.setHistory("Укулеле появилась на Гавайских островах во второй половине XIX века, куда её, под названием" +
                "\n машети да браса (порт. machete da braça), завезли португальцы с острова Мадейра.Название инструмента (" +
                "\nгав. ʻukulele) переводится как «скачущая блоха» ");
        this.setSound("трынь трынь трынь трыыЫЫЫынннььььь .....");
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

    public void history() {
        System.out.println(getHistory());
    }
}
