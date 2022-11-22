package com.company;

public class PythonFactory implements IInfoFactory{
    @Override
    public IInputOutput createInputOutput() {
        return new PythonIO();
    }

    @Override
    public IFamousFramework createFamousFramework() {
        return new PythonFamousFramework();
    }
}
