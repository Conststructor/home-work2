package tu.topacademy;

import javax.swing.event.HyperlinkEvent;

public class Human {
    private String firstName;
    private String surName;
    private String gender;
    private int years;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

Human(){
        firstName="Adam";
        surName="Sinner";
        years=81;
        gender="male";
}

public void showInfo(){
    System.out.println("Name : "+getFirstName()+" "+getSurName());
    System.out.println("Gender : "+getGender());
    System.out.println("Years : "+getYears()+"\n");
}
}

