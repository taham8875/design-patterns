package com.company;

public class Java implements IInputOutput{
    @Override
    public String input() {
        return "input.nextLine();";
    }

    @Override
    public String output() {
        return " System.out.println(\"Hello World!\");";

    }
}
