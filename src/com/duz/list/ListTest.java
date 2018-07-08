package com.duz.list;

public class ListTest {
    public static void main(String[] args) {
        List list = new List();

        System.out.println( list.isEmpty() );
        list.add( "pierwszy" );
        System.out.println( list );

        System.out.println( "head: " + list.getHead() );
        System.out.println( "tail: " + list.getTail() );

        list.add( "drugi" );
        list.add( "trzeci", 2 );
        list.print();

        list.add( "czwarty", 2 );
        list.print();

        System.out.println();

        System.out.println( list.getPosition( 3 ) );

        System.out.println();
        list.print();

        list.remove( 2 );
        list.print();
        System.out.println();
        list.printBackwards();
    }

}
