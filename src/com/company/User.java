package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class User implements RegisterUser {
    private String registerUsername;
    private String registerPassword;
    private String name;
    private String email;
    private String loginUsername;
    private String loginPassword;
    protected ArrayList<Coffee> favourites = new ArrayList<>();
    private int chooseSocialMedia;
    private String socialMedia[] = {"1. Facebook", "2. Instagram", "3. Twitter"};
    Scanner in = new Scanner(System.in);

    public User() {

    }

    public void setRegisterUsername(String registerUsername) {
        this.registerUsername = registerUsername;
    }

    public void setRegisterPassword(String registerPassword) {
        this.registerPassword = registerPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void registerPage() {
        System.out.println("Enter your full name: ");
        name = in.nextLine();
        setName(name);

        System.out.println("Enter your email: ");
        email = in.nextLine();
        setEmail(email);

        System.out.println("Enter username: ");
        registerUsername = in.nextLine();
        setRegisterUsername(registerUsername);

        System.out.println("Enter password: ");
        registerPassword = in.nextLine();
        setRegisterPassword(registerPassword);
    }

    public void login() {
        boolean loginCheck = true;
        while (loginCheck) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your username here: ");
            loginUsername = scan.nextLine();

            System.out.println("Enter your password here: ");
            loginPassword = scan.nextLine();

            if (loginUsername.equalsIgnoreCase(registerUsername) && loginPassword.equalsIgnoreCase(registerPassword)) {
                System.out.println("You are logged in");
                loginCheck = false;
            } else {
                System.out.println("Your username or password is incorrect, please try again");
            }
        }
    }

    public void addFavourite() {
        Coffee coffee = new Coffee();
        System.out.println("Enter the number of coffee you want to store: ");
        Scanner scan = new Scanner(System.in);
        int chooseCoffee = scan.nextInt();

        switch (chooseCoffee) {

            case 1:
                favourites.add(coffee.getProduct1());
                break;

            case 2:
                favourites.add(coffee.getProduct2());
                break;

            case 3:
                favourites.add(coffee.getProduct3());
                break;

            case 4:
                favourites.add(coffee.getProduct4());
                break;
        }
    }

    public void showFavourites() {
        StringBuilder builder = new StringBuilder();
        for (Coffee favourite : favourites) {
            builder.append(favourite);
        }
        String userList = builder.toString();
        System.out.println(userList);
    }

    public void rateCoffee() {
        System.out.println("Enter the name of the product you want to rate: ");
        String userChoice = in.nextLine();
        System.out.println("Enter you rate, a number between 1-5: ");
        String userRate = in.nextLine();

        for (Coffee favourite : favourites) {
            if (userChoice.equalsIgnoreCase(favourite.getProduct())) {
                favourite.setRate(userRate);
                System.out.println("Your coffee is now rated");
                break;
            }
            if (favourites.indexOf(favourite) == favourites.size() - 1) {
                System.out.println("You don't seem to have this product in your list...");
            }
        }
    }

    public void shareCoffee() {
        System.out.println("Enter the name of the product you want to share: ");
        String userChoice = in.nextLine();

        System.out.println("Where do you want to share it? ");
        for (int i = 0; i < socialMedia.length; i++)
            System.out.println(socialMedia[i]);

        chooseSocialMedia = in.nextInt();
        switch (chooseSocialMedia) {
            case 1:
                for (Coffee favourite : favourites) {
                    if (userChoice.equalsIgnoreCase((favourite.getProduct()))) {
                        System.out.println("Your information is now shared with your friends on Facebook ");
                    }
                }
                break;
            case 2:
                for (Coffee favourite : favourites) {
                    if (userChoice.equalsIgnoreCase((favourite.getProduct()))) {
                        System.out.println(" Your info is now shared on Instagram ");
                    }
                }
                break;
            case 3:
                for (Coffee favourite : favourites) {
                    if (userChoice.equalsIgnoreCase((favourite.getProduct()))) {
                        System.out.println("Your info is now on Twitter. Let the hate begin");
                    }
                }
                break;

            default:
                System.out.println("You don't seem to have this product in your list...");
        }

    }
}
