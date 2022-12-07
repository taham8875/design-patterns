package com.company;

public class JavaFactory extends Factory {
    @Override
    public IInputOutput createLanguage() {
        return new Java();
    }
}
