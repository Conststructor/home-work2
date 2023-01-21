package tu.topacademy;

public class Crocodile extends Animal{
    Crocodile(){
        setGenus("Рептилия");
        setKind("Хладнокровные");
        setName("Гена");
    }
    public void showInfo(){
        System.out.println(getClass()+ "\nТип : "+getGenus()+"\nВид : "+getKind()+"\nИмя : "+getName()+"\n");
    }
}
