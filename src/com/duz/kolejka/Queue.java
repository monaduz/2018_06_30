package com.duz.kolejka;

public class Queue {

    private QueueElement top;
    private QueueElement front;

    private int size = 0;

    public Queue() {
        front = null;
        top = null;
        size = 0;
    }

    public void push(Boxx element) {
        QueueElement temporary = new QueueElement( element, top );
        if (size == 0) {
            front = new QueueElement( element, null );
            top = front;
            size++;
            System.out.println( "dodano: " + top.value );
        } else {
            top.nextElement = temporary;
            size++;
            top = temporary;
            System.out.println( "dodano: " + top.value );
        }
    }

    public Boxx front() {
        return front.value;
    }

    public void pop() {
        System.out.println( "usunięto: " + front.value );
        front = front.nextElement;

        size--;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    private class QueueElement {
        Boxx value;
        QueueElement previousElement;
        QueueElement nextElement;

        public QueueElement(Boxx value, QueueElement previousElement) {
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
