package com.duz.stosWskaznik;

class LinkedStack {

    private StackElement top;
    private int size=0;

    public LinkedStack() {
        top=null;
        size=0;
    }

    public void push (Boxx element){
        size++;
        top = new StackElement( element,top );
    }

    public Boxx peek(){
        return top.value;
    }

    public void pop() {
        top=top.previousElement;
        size--;
    }

    public boolean isEmpty(){
        return size==0;
    }

    private class StackElement {
        Boxx value;
        StackElement previousElement;

        public StackElement(Boxx value, StackElement previousElement) {
            this.value = value;
            this.previousElement = previousElement;
        }

        @Override
        public String toString() {
            return "StackElement{" +
                    "value=" + value +
                    ", previousElement=" + previousElement +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LinkedStack{" +
                "top=" + top +
                ", size=" + size +
                '}';
    }
}
