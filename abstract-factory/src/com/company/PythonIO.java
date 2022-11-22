package com.company;

public class PythonIO implements IInputOutput{
    @Override
    public String input() {
        return "insert(\"Enter your input here\")";
    }

    @Override
    public String output() {
        return "print(\"Hello World!\")";
    }
}
