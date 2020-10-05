package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class User {

    private int chooseSocialMedia;
    private String socialMedia [] = {"1. Facebook", "2. Instagram", "3. Twitter"};
    Scanner userInput = new Scanner(System.in);


    private String username = "user1";
    private String password = "password1";
    protected ArrayList<Coffee> favourites = new ArrayList<>();


    public void login() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username here: ");
        username = scan.nextLine();

        System.out.println("Enter your password here: ");
        password = scan.nextLine();
        verifyUser();

    }

    public void shareCoffee() {
        System.out.println("Where do you want to share it? ");
        for (int i = 0; i < socialMedia.length; i++)
            System.out.println(socialMedia[i]);

        chooseSocialMedia = userInput.nextInt();
        switch (chooseSocialMedia) {
            case 1:
                System.out.println("Your information is now shared with your friends on facebook ");
                break;
            case 2:
                System.out.println(" Your info is now shared on Instagram ");
                break;
            case 3:
                System.out.println("Your info is now on Twitter. Let the hate begin");
                break;
        }

    }

    public void verifyUser() {
        if ("user1".equals(username) && "password1".equals(password)) {
            System.out.println("You are logged in");
        } else {
            System.out.println("Your username or password is invalid");
        }
    }

    public void addFavourite() {
        Coffee coffee = new Coffee();
        System.out.println("Enter the number of coffee you want to store: ");
        Scanner scan = new Scanner(System.in);
        int chooseCoffee = scan.nextInt();

        switch (chooseCoffee) {

            case 1:
                favourites.add(0, coffee.getProduct1());
                //System.out.println(coffee.product1.producer + " is added to your favourites");
                break;

            case 2:
                favourites.add(1, coffee.getProduct2());
                //System.out.println(coffee.product2.producer + " is added to your favourites");
                break;

            case 3:
                favourites.add(2, coffee.getProduct3());
                //System.out.println(coffee.product3.producer + " is added to your favourites");
                break;

            case 4:
                favourites.add(3, coffee.getProduct4());
                //System.out.println(coffee.product4.producer + " is added to your favourites");
                break;
        }
    }

    public void showList() {
        StringBuilder builder = new StringBuilder();
        for (Coffee favourite : favourites) {
            builder.append(favourite);
        }
        String userList = builder.toString();
        System.out.println(userList);
    }
}
