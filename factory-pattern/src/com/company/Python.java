package com.company;

public class Python implements  IInputOutput{
    @Override
    public String input() {
        return "insert(\"Enter your input here\")";
    }

    @Override
    public String output() {
        return "print(\"Hello World!\")";
    }
}
