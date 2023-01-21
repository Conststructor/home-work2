package tu.topacademy;

public class Sailor extends Human {
private String shipName;
private String position;

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    Sailor(){
        setFirstName("William");
        setSurName("Adama");
        position="capitan";
        shipName="Invincible";
    }
    public void showInfo(){
        System.out.println("Name : "+getFirstName()+" "+getSurName());
        System.out.println("Sailor : "+getPosition()+" on ship \"" +getShipName()+"\"\n");
    }
}
