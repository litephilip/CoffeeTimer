package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Coffee {

    private String producer;
    private String product;
    private String information;
    private Coffee product1;
    private Coffee product2;
    private Coffee product3;
    private Coffee product4;
    private ArrayList<Coffee> products = new ArrayList<>();

    public Coffee() {

    }

    public Coffee(String producer, String product, String information) {
        this.producer = producer;
        this.product = product;
        this.information = information;
    }

    public void listCoffee() {

        product1 = new Coffee("1. Löfbergs", "Mellanrost", "En originalblandning, en fyllig  mellanrost, som framhäver en fin och mjuk arom.");
        product2 = new Coffee("2. Arvid Nordqvist", "Classic Festivita", "Festivita är ett extra mörkrostat bryggmalet kaffe med intensiv doft. Kraftfull och fyllig smak med inslag av mörk choklad.");
        product3 = new Coffee("3. Zoéga", "Skånerost", "Skånerost är ett malet mörkrostat bryggkaffe från Zoégas bestående av 100 % Arabicabönor, som ger ett särskilt smakrikt kaffe med mjuka och spännande nyanser av frukt och mörka bär.");
        product4 = new Coffee("4. Gevalia", "Mörkrost", "Gevalia mörkrostade kaffe består av 100% Arabicabönor, med en välbalanserad och lätt fruktig smak");

        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        StringBuilder stringBuilder = new StringBuilder();
        for (Coffee product : products) {
            stringBuilder.append(product);
        }
        String text = stringBuilder.toString();
        System.out.println(text);
    }

    public Coffee getProduct1() {
        return product1;
    }

    public Coffee getProduct2() {
        return product2;
    }

    public Coffee getProduct3() {
        return product3;
    }

    public Coffee getProduct4() {
        return product4;
    }

    public void addCoffee() {
        User user = new User();
        System.out.println("Enter the number of coffee you want to store: ");
        Scanner scan = new Scanner(System.in);
        int chooseCoffee = scan.nextInt();

        switch (chooseCoffee) {

            case 1:
                user.favourites.add(0, product1);
                //System.out.println(product1.producer + " is added to your favourites");
                break;

            case 2:
                user.favourites.add(1, product2);
                //System.out.println(product2.producer + " is added to your favourites");
                break;

            case 3:
                user.favourites.add(2, product3);
                //System.out.println(product3.producer + " is added to your favourites");
                break;

            case 4:
                user.favourites.add(3, product4);
                //System.out.println(product4.producer + " is added to your favourites");
                break;
        }
    }

    @Override
    public String toString() {
        return "\nProducer: " + producer +
                "\nProduct: " + product +
                "\nInformation: " + information + "\n";
    }
}
