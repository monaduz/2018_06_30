package com.duz.stosGeneryczne;

public class BoxTest {
    public static void main(String[] args) {

        Box<String, Integer> box =
                new Box<>( "jakiś element", 10 );
        Box<Integer, Person> box2 =
                new Box<>( 2010, new Person( "Alicja", 8 ) );
        Box<Person, Person> box3 =
                new Box<>( new Person( "Antoni", 5 ), new Person( "Tomasz", 3 ) );

    }
}
