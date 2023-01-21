package tu.topacademy;

public class Tiger extends Animal{
    Tiger(){
        setGenus("Кошачие");
        setKind("Млееопитающее");
        setName("Шархан");
    }
    public void showInfo(){
        System.out.println(getClass()+"\nТип : "+getGenus()+"\nВид : "+getKind()+"\nИмя : "+getName()+"\n");
    }
}
