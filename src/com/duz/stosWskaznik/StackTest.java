package com.duz.stosWskaznik;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack( 5 );

        Boxx<Integer> boxx1 = new Boxx<>( 23 );
        Boxx<String> boxx2 = new Boxx<>("fsfs");

        System.out.println( "isEmpty: " + stack.isEmpty() );
        stack.push( boxx1 );
        System.out.println( "isEmpty: " + stack.isEmpty() );
        System.out.println( "stack top: " + stack.peek() );
        stack.push(boxx2 );
        System.out.println( "stack top: " + stack.peek() );

        System.out.println( stack.pop() );
        System.out.println( "stack top: " + stack.peek() );

    }

}
