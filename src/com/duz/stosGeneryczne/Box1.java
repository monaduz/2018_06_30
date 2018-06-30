package com.duz.stosGeneryczne;

public class Box1<T extends Number> {
    private T element;

    public Box1(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "Box1{" +
                "element=" + element +
                '}';
    }

}
