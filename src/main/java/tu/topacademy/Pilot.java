package tu.topacademy;

import java.security.PublicKey;

public class Pilot extends Human{
    private String aircraftType;
    private int aircraftNumber;

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getAircraftNumber() {
        return aircraftNumber;
    }

    public void setAircraftNumber(int aircraftNumber) {
        this.aircraftNumber = aircraftNumber;
    }

    Pilot(){
        setFirstName("Aleksandr");
        setSurName("Pokrishkin");
        aircraftNumber=73;
        aircraftType="Aerocobra";
    }

    public void showInfo(){
        System.out.println("Name : "+getFirstName()+" "+getSurName());
        System.out.println("Plane : "+getAircraftType()+" with # " +getAircraftNumber()+"\n");
    }
}
