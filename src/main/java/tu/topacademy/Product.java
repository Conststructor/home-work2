package tu.topacademy;

import java.util.Scanner;

public class Product extends Money {

    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    Product() {
        this.setPeace(0);
        this.setPart(0);
        System.out.println("Введите название товара :");
        Scanner input = new Scanner(System.in);
        this.setProductName(input.nextLine());
    }

    Product(String productName, int peace, int part) {
        this.setPeace(peace);
        this.setPart(part);
        this.productName = productName;
    }

    public void showPrice() {
        System.out.println(getProductName()+" цена : " + getPeace() + "$ " + getPart() + " c\n");
    }

    public void declarePrice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Установите количество базовых единиц за товар :");
        int peace = input.nextInt();
        System.out.println("Установите количество производных единиц за товар:");
        int part = input.nextInt();
        this.setPeace(peace);
        this.setPart(part);
    }


    public void decreacePrice(int peace, int part) {
        this.setPeace(this.getPeace()-peace);
        this.setPart(this.getPart()-part);
    }

    public void decreacePrice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество базовых единиц снижения цены :");
        int peace = input.nextInt();
        System.out.println("Введите количество произвоных единиц для снижения цены:");
        int part = input.nextInt();
        decreacePrice(peace, part);
    }
}
