package com.company;

public class Javascript implements IInputOutput{
    @Override
    public String input() {
        return "prompt(\"Enter your input here\");";
    }

    @Override
    public String output() {
        return "console.log(\"Hello World!\");";
    }
}
