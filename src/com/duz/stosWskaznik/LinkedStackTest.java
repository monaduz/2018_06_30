package com.duz.stosWskaznik;


public class LinkedStackTest {
    public static void main(String[] args) {
        Boxx<Integer> boxx1 = new Boxx<>( 23 );
        Boxx<String> boxx2 = new Boxx<>( "ggfdgdf" );
        Boxx<Double> boxx3 = new Boxx<>( 23.25 );

        LinkedStack linkedStack = new LinkedStack();

        System.out.println( "isEmpty? " + linkedStack.isEmpty() );
        linkedStack.push( boxx1 );
        System.out.println( "isEmpty? " + linkedStack.isEmpty() );
        System.out.println( "wydrukuj stos: \n" + linkedStack );
        linkedStack.push( boxx2 );
        System.out.println( "wydrukuj stos: \n" + linkedStack );
        ;
        linkedStack.push( boxx3 );
        System.out.println( "wierzchołek: " + linkedStack.peek() );
        linkedStack.pop();
        linkedStack.pop();
        System.out.println( "wydrukuj stos: \n" + linkedStack );


    }
}
