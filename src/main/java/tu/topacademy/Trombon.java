package tu.topacademy;

public class Trombon extends MusicalInstrument{
    Trombon() {
        this.setName("Тромбон");
        this.setDescription("Европейский духовой амбушюрный инструмент.");
        this.setHistory("Появление тромбона относится к XV веку. Принято считать, что непосредственными предшественниками " +
                "этого инструмента были кулисные трубы, при игре на которых у музыканта была возможность передвигать " +
                "трубку инструмента, таким образом получая хроматический звукоряд.");
        this.setSound("уап уап уап уаааааааап .....");
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
