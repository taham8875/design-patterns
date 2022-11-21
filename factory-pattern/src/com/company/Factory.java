package com.company;

public abstract class Factory {
    public String printInfo(){
        IInputOutput language = createLanguage();
        return "input in your language is : %s\nWhile output is : %s".formatted(language.input(), language.output());
    }

    public abstract IInputOutput createLanguage();
}
