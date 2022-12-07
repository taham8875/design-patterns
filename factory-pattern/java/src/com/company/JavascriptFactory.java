package com.company;

public class JavascriptFactory extends Factory {
    @Override
    public IInputOutput createLanguage() {
        return new Javascript();
    }
}
