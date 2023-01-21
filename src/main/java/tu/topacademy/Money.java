package tu.topacademy;

import java.util.Scanner;

public class Money {
    private int peace;
    private int part;

    public int getPeace() {
        return peace;
    }

    public void setPeace(int peace) {
        this.peace = peace;
    }

    public int getPart() {
        return part;
    }

    public void setPart(int part) {
        if (part >= 100) {
            this.peace = peace + (part / 100);
            this.part = part % 100;
        } else if (part <= -100) {
            this.peace = peace - (part / 100);
            this.part = part % 100;
        } else
            this.part = part;
    }

    Money() {
        peace = 0;
        part = 0;
    }

    Money(int peace, int part) {
        this.peace = peace;
        this.part = part;

        /*if (part >= 100) {
            this.peace = peace + (part / 100);
            this.part = part % 100;
        } else if (part <= -100) {
            this.peace = peace - (part / 100);
            this.part = part % 100;
        }*/
    }

    Money(int peace) {
        this.peace = peace;
        this.part = 0;
    }

    public void setMoney() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество базовых единиц :");
        peace = input.nextInt();
        System.out.println("Введите количество произвоных единиц :");
        part = input.nextInt();
    }

    public void showMoney() {
        System.out.println("You have : " + getPeace() + "$ " + getPart() + " c\n");
    }
}
