package com.company;

import java.util.Scanner;

public class Demo {
    static Factory factory;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favourite language");
        String favouriteLanguage = input.nextLine();
        configure(favouriteLanguage);
        System.out.println(factory.printInfo());
    }

    private static void configure(String favouriteLanguage) {
        if (favouriteLanguage.equals("python")) {
            factory = new PythonFactory();
        } else if (favouriteLanguage.equals("java")) {
            factory = new JavaFactory();
        } else if (favouriteLanguage.equals("javascript")) {
            factory = new JavascriptFactory();
        } else {
            System.out.println("Invalid input, assign to java as default");
            factory = new JavaFactory();
        }
    }
}
