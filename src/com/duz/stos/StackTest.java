package com.duz.stos;

public class StackTest {
    public static void main(String[] args) {
        Stack stack = new Stack( 5 );
        System.out.println( "isEmpty: " + stack.isEmpty() );
        stack.push( 9 );
        System.out.println( "isEmpty: " + stack.isEmpty() );
        System.out.println( "stack top: " + stack.peek() );
        stack.push( 4 );
        System.out.println( "stack top: " + stack.peek() );

        System.out.println( stack.pop() );
        System.out.println( "stack top: " + stack.peek() );

    }

}
