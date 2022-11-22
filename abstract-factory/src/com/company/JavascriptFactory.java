package com.company;

public class JavascriptFactory implements IInfoFactory{
    @Override
    public IInputOutput createInputOutput() {
        return new JavascriptIO();
    }

    @Override
    public IFamousFramework createFamousFramework() {
        return new JavascriptFamousFramework();
    }
}
