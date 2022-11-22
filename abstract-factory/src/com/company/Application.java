package com.company;

public class Application {
    private final IInputOutput IO;
    private final IFamousFramework famousFramework;
    public Application (IInfoFactory factory){
        IO = factory.createInputOutput();
        famousFramework = factory.createFamousFramework();
    }

    public void run(){
        System.out.printf("input in your language is : %s\nWhile output is : %s%n", IO.input(), IO.output());
        System.out.printf("Famous Framework is %s%n", famousFramework.famousFramework());
    }
}
