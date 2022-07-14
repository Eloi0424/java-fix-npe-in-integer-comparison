package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(compare(123, 456));
        System.out.println(compare(123, 123));
        System.out.println(compare(123, null));
    }

    public static boolean compare(int a, Integer b) {
        if( a.getClass().getSimpleName() != "Int"){
            return false;
        } else if ( a.getClass().getSimpleName() == "Int" ) {
            return a == b;
        }
    }
}
