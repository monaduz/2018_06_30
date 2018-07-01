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

    public List(Element head, Element tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
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
            tail.setIndex( size );
        } else {
            Element temporary = new Element( element, tail );
            tail.setNext( temporary );
            tail = temporary;
            System.out.println( "dodano: " + element + " na koniec listy" );
            size++;
            tail.setIndex( size );
        }
    }

    public void add(T element, int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (isEmpty()) {
            add( element );
        } else {
            Element current = new Element( null );
            current = head;
            while (current.getIndex() != index) {
                current = current.getNext();
            }
            Element temporary = new Element( element, current.getLast(), current );
            temporary.setIndex( index );
            current.getLast().setNext( temporary );
            current.setLast( temporary );
            current = temporary;
            System.out.println( "wstawiono element: " + element + " na pozycji " + index );
            size++;
            current = current.getNext();
            while (current != null) {
                current.setIndex( ++index );
                current = current.getNext();
            }
        }

    }

    public void remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        Element current = head;
        while (current.getIndex() != index) {
            current = current.getNext();
        }
        current.getLast().setNext( current.getNext() );
        current.getNext().setLast( current.getLast() );
        System.out.println("usunięto element: "+current + " z indeksu " + index);
        size--;
        current = current.getNext();
        while (current != null) {
            current.setIndex( index++ );
            current = current.getNext();
        }
    }

    public Element getPosition(int index) {
        Element current = head;
        while (current.getIndex() != index) {
            current = current.getNext();
        }
        return current;
    }


    @Override
    public String toString() {
        return "List{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
