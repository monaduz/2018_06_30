package com.duz.kolejka;

import java.util.EmptyStackException;

public class Queue<T> {

    private QueueElement<T> last;
    private QueueElement<T> front;

    private int size;

    public Queue() {
        front = null;
        last = null;
        size = 0;
    }

    public void push(T element) {
        QueueElement<T> temporary = new QueueElement<T>( element, last );
        if (size == 0) {
            front = new QueueElement<T>( element, null );
            last = front;
            size++;
            System.out.println( "dodano: " + last.value );
        } else {
            last.nextElement = temporary;
            size++;
            last = temporary;
            System.out.println( "dodano: " + last.value );
        }
    }

    public T front() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return (T) front.value;
    }

    public void pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        if (size==1){
          last=null;
        }
        front = front.nextElement;
        front.previousElement=null;
        size--;
        System.out.println( "usunięto: " + front.value );
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private class QueueElement<T> {
        T value;
        QueueElement<T> previousElement;
        QueueElement<T> nextElement;

        public QueueElement(T value, QueueElement<T> previousElement) {
            this.value = value;
            this.previousElement = previousElement;
            this.nextElement = null;
        }

        @Override
        public String toString() {
            return "QueueElement{" +
                    "value=" + value +
                    ", nextElement=" + nextElement +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", size=" + size +
                '}';
    }
}
