package com.duz.list;

public class Element<T> {
    private T element;
    private Element last;
    private Element next;
    private int index;



    public Element(T element) {
        this.element=element;
        last=null;
        next=null;
    }

    public Element(T element, Element last, Element next) {
        this.element = element;
        this.last = last;
        this.next = next;
    }

    public Element(T element, Element last) {
        this.element = element;
        this.last = last;
        next=null;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setLast(Element last) {
        this.last = last;
    }

    public int getIndex() {
        return index;
    }

    public Element getNext() {
        return next;
    }

    public Element getLast() {
        return last;
    }

    @Override
    public String toString() {
        return "Element{" +
                "element=" + element +
                ", index=" + index +
                "\n, next=" + next +
                '}';
    }
}
