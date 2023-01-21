package tu.topacademy;

public class Kenguru extends Animal{
    Kenguru(){
        setGenus("Сумчатые");
        setKind("Млекопитающие");
        setName("Джек");
    }
    public void showInfo(){
        System.out.println(getClass()+ "\nТип : "+getGenus()+"\nВид : "+getKind()+"\nИмя : "+getName()+"\n");
    }
}
