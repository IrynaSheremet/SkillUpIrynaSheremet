package com.skillup.classes;

class ClassWithException{

    public static int getNumberComparison(int num) throws SomeMyException {
        if(num<5) throw new SomeMyException("The number is less than 5", num);

        return num;
    }
}

class SomeMyException extends Exception{

    private int number;
    public int getNumber(){

        return number;
    }
    public SomeMyException(String message, int num){

        super(message);
        number=num;
    }
}