package com.skillup.classes;

public class Main {
    public static void main(String[] args) {

        try {
            int result = ClassWithException.getNumberComparison(4);
            System.out.println(result);
        }
        catch (SomeMyException ex) {

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}