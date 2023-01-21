package tu.topacademy;

public class Skripka extends MusicalInstrument {
    Skripka() {
        this.setName("Скрипка");
        this.setDescription("Скрипка — смычковый музыкальный инструмент с четырьмя струнами");
        this.setHistory("Первые упоминания о скрипке датируются началом 16 веком, в Италии. Хотя не сохранилось ни " +
                "\nодного инструмента тех лет, ученые делают свои суждения по картинам и текстам того времени. Очевидно, " +
                "\nчто скрипка произошла от других смычковых инструментов. Историки связывают её появление с такими " +
                "\nинструментами как греческая лира, испанская фидель, арабский ребаб, британская кротта и даже русской " +
                "\nчестырехструнной смычковой жигой. ");
        this.setSound("ууыууиыыииииуыууыу.....");
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
