package com.company;

import java.util.Scanner;

public class TimerApplication {

    private int userChoice;
    boolean showMenu = true;
    private String enterMainMenu = "Press Y to return to main menu";
    Scanner userInput = new Scanner(System.in);
    CoffeeTimer coffeeTimer = new CoffeeTimer();
    Coffee coffee = new Coffee();
    User user = new User();

    public void registerPage() {
        user.registerPage();
    }

    public void menu() {

        while (showMenu) {
            System.out.println("What do you want to do?");
            System.out.println("1. Login");
            System.out.println("2. Start timer");
            System.out.println("3. Read about coffee");
            System.out.println("4. Add coffee to your list");
            System.out.println("5. Show your favourite coffees");
            System.out.println("6. Rate coffee");
            System.out.println("7. Share coffee on your social media");
            System.out.println("8. Exit");
            System.out.println("Enter a number: ");
            userChoice = userInput.nextInt();

            switch (userChoice) {
                case 1:
                    user.login();
                    enterMainMenu();
                    break;

                case 2:
                    coffeeTimer.setTimer();
                    enterMainMenu();
                    break;

                case 3:
                    coffee.listCoffee();
                    enterMainMenu();
                    break;

                case 4:
                    coffee.listCoffee();
                    user.addFavourite();
                    enterMainMenu();
                    break;

                case 5:
                    user.showFavourites();
                    enterMainMenu();
                    break;

                case 6:
                    user.showFavourites();
                    user.rateCoffee();
                    enterMainMenu();
                    break;

                case 7:
                    user.showFavourites();
                    user.shareCoffee();
                    enterMainMenu();
                    break;

                case 8:
                    System.exit(0);
            }
        }
    }

    public void enterMainMenu() {
        System.out.println(enterMainMenu);
        String backToMainMenu = userInput.next();
        if (backToMainMenu.equalsIgnoreCase("Y")) {
            showMenu = true;
        } else {
            showMenu = false;
        }
    }
}
