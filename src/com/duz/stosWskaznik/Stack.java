package com.duz.stosWskaznik;

import java.util.EmptyStackException;

public class Stack {

    private Boxx[] stack;
    private Boxx top;
    private Integer size;

    public Stack(Integer size) {
        stack = new Boxx[size];
        top = null;
        this.size = 0;
    }

    public void push(Boxx element) {
        if (size != stack.length) {
            stack[size++] = element;
            top = element;
        } else System.out.println( "stos pełny" );
    }

    public Boxx peek() {
        if (!isEmpty()) {
            return top;
        } else {
            throw new EmptyStackException();
        }
    }

    public Boxx pop() {
        if (!isEmpty()) {
            size--;
            if (size==0){
                top = null;
              return stack[size];
            }
            top = stack[size-1];
            return stack[size];
        }
        else{
            throw new EmptyStackException();
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
