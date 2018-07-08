package com.duz.list;


public class List<T> {
    private Element head;
    private Element tail;
    private int size;

    public List() {
    }

    public Element getHead() {
        return head;
    }

    public Element getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(T element) {
        if (isEmpty()) {
            head = new Element( element );
            tail = head;
            System.out.println( "dodano: " + element + " - pierwszy element" );
            size++;
        } else {
            Element temporary = new Element( element, tail );
            tail.setNext( temporary );
            tail = temporary;
            System.out.println( "dodano: " + element + " na koniec listy" );
            size++;
        }
    }

    public void add(T element, int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (isEmpty()) {
            add( element );
        } else {
            Element current = getCurrent( index );
            Element temporary = new Element( element, current.getPrevious(), current );
            current.getPrevious().setNext( temporary );
            current.setPrevious( temporary );
            System.out.println( "wstawiono element: " + element + " na pozycji " + index );
            size++;
        }
    }

    public Element getCurrent(int index) {
        Element current = head;
        int counter = 1;
        while (counter != index) {
            current = current.getNext();
            counter++;
        }
        return current;
    }


    public void remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        Element current = getCurrent( index );
        current.getPrevious().setNext( current.getNext() );
        current.getNext().setPrevious( current.getPrevious() );
        System.out.println( "usunięto element: " + current + " z indeksu " + index );
        size--;
    }

    public Element getPosition(int index) {
        return getCurrent( index );
    }

    public void print() {
        Element current = head;
        for (int i = 1; i <= size; i++) {
            System.out.println( "Element " + i + ": " + current );
            current = current.getNext();
        }
    }

    public void printBackwards() {
        Element current = tail;
        for (int i = size; i > 0; i--) {
            System.out.println( "Element " + i + ": " + current );
            current = current.getPrevious();
        }
    }


    @Override
    public String toString() {
        return "List{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}