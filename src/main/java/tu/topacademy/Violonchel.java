package tu.topacademy;

public class Violonchel extends MusicalInstrument{
    Violonchel() {
        this.setName("Виолончель");
        this.setDescription("Скрипка которую хорошо кормили в детстве");
        this.setHistory("Появление виолончели относится к началу XVI века. Первоначально она применялась как басовый" +
                "\n инструмент для сопровождения пения или исполнения на инструменте более высокого регистра. ");
        this.setSound("ууУУУУуууу УУУУуууУууууу .....");
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
