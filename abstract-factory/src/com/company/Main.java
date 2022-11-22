package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favourite language");
        String favouriteLanguage = input.nextLine();
        Application application = configure(favouriteLanguage);
        application.run();
    }

    private static Application configure(String favouriteLanguage) {
        IInfoFactory factory;
        Application application;
        if (favouriteLanguage.equals("python")) {
            factory = new PythonFactory();
        } else {
            System.out.println("Invalid input, assign to javascript as default");
            factory = new JavascriptFactory();
        }
        application = new Application(factory);
        return application;

    }
}
