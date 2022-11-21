package com.company;

public class PythonFactory extends Factory {
    @Override
    public IInputOutput createLanguage() {
        return new Python();
    }
}
