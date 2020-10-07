package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Coffee {


    private String producer;
    private String product;
    private String information;
    private String rateText = "This product is not rated yet";
    protected static Coffee product1 = new Coffee("1. Löfbergs", "Mellanrost", "En originalblandning, en fyllig  mellanrost, som framhäver en fin och mjuk arom.");
    protected static Coffee product2 = new Coffee("2. Arvid Nordqvist", "Classic Festivita", "Festivita är ett extra mörkrostat bryggmalet kaffe med intensiv doft. Kraftfull och fyllig smak med inslag av mörk choklad.");
    protected static Coffee product3 = new Coffee("3. Zoéga", "Skånerost", "Skånerost är ett malet mörkrostat bryggkaffe från Zoégas bestående av 100 % Arabicabönor, som ger ett särskilt smakrikt kaffe med mjuka och spännande nyanser av frukt och mörka bär.");
    protected static Coffee product4 = new Coffee("4. Gevalia", "Mörkrost", "Gevalia mörkrostade kaffe består av 100% Arabicabönor, med en välbalanserad och lätt fruktig smak");
    protected static ArrayList<Coffee> products = new ArrayList<>();

    public Coffee() {

    }

    public Coffee(String producer, String product, String information) {
        this.producer = producer;
        this.product = product;
        this.information = information;
    }

    static {
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
    }

    public String getProduct() {
        return product;
    }

    public void setRate(String rateText) {
        this.rateText = rateText;
    }

    @Override
    public String toString() {
        return "\nProducer: " + producer +
                "\nProduct: " + product +
                "\nInformation: " + information +
                "\nRate: " + rateText + "\n";
    }

    public void listCoffee() {

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
}
