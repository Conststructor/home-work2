package tu.topacademy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Human h1 =new Human();
        Builder b1 = new Builder();
        Sailor s1 = new Sailor();
        Pilot p1 = new Pilot();

        h1.showInfo();
        b1.showInfo();
        s1.showInfo();
        p1.showInfo();
    }
}

