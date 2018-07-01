package com.duz.kolejka;

public class QueueTest {
    public static void main(String[] args) {
        Boxx<Integer> boxx1 = new Boxx<>( 10 );
        Boxx<String> boxx2 = new Boxx<>( "ggfdgdf" );
        Boxx<Double> boxx3 = new Boxx<>( 23.25 );

        Queue queue = new Queue();

        System.out.println( "isEmpty? " + queue.isEmpty() );
        queue.push( boxx1 );
        System.out.println( "isEmpty? " + queue.isEmpty() );
        System.out.println( "wydrukuj stos: \n" + queue );
        queue.push( boxx2 );
        System.out.println( "wydrukuj stos: \n" + queue );
        queue.push( boxx3 );
        System.out.println( "front: " + queue.front() );
        queue.pop();
        queue.pop();
        System.out.println( "front: " + queue.front() );
        System.out.println( "wydrukuj stos: \n" + queue );


    }

}
