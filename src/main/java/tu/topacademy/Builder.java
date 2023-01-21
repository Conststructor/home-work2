package tu.topacademy;

public class Builder extends Human{
    private String buildObject;
    private String companyName;
    public String getBuildObject() {
        return buildObject;
    }

    public void setBuildObject(String buildObject) {
        this.buildObject = buildObject;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
Builder(){
    setFirstName("Peter");
    setSurName("Pushkin");
    buildObject="Bridge";
    companyName="Mostostroy-011";
    }

    public void showInfo(){
        System.out.println("Name : "+getFirstName()+" "+getSurName());
        System.out.println("Build object : "+getBuildObject());
        System.out.println("Company : "+getCompanyName()+"\n");
    }
}
