package com.duz.list;

public class ListTest {
    public static void main(String[] args) {
        List list = new List();

        System.out.println( list.isEmpty() );
        list.add( "nini" );
        System.out.println( list );

        System.out.println("head: "+ list.getHead() );
        System.out.println("tail: "+ list.getTail() );

        list.add( "ojp" );
        list.add( "gfdfd" );
        System.out.println( list );

        list.add( "gdgdfgd",2 );
        System.out.println( list );

        System.out.println(        );

        System.out.println( list.getPosition( 3 ) );

        System.out.println();

        list.remove( 3 );
        System.out.println( list );
    }
}
