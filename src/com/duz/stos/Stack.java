package com.duz.stos;

import java.util.EmptyStackException;

public class Stack {

    private Integer[] stack;
    private Integer top;
    private Integer size;

    public Stack(Integer size) {
        stack = new Integer[size];
        top = 0;
        this.size = 0;
    }

    public void push(Integer element) {
        if (size != stack.length) {
            stack[size++] = element;
            top = element;
        } else System.out.println( "stos pełny" );
    }

    public int peek() {
        if (!isEmpty()) {
            return top;
        } else {
            throw new EmptyStackException();
        }
    }

    public Integer pop() {
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
