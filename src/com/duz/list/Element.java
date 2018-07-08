package com.duz.list;

public class Element<T> {
    private T element;
    private Element previous;
    private Element next;

    public Element(T element) {
        this.element = element;
        previous = null;
        next = null;
    }

    public Element(T element, Element previous, Element next) {
        this.element = element;
        this.previous = previous;
        this.next = next;
    }

    public Element(T element, Element previous) {
        this.element = element;
        this.previous = previous;
        next = null;
    }

    public void setNext(Element next) {
        this.next = next;
    }


    public void setPrevious(Element previous) {
        this.previous = previous;
    }

    public Element getNext() {
        return next;
    }

    public Element getPrevious() {
        return previous;
    }

    @Override
    public String toString() {
        return " " + element;
    }
}
