package com.code_block;

public class Main {

    //Static block is a special member of a class.
    //It is implicitly invoked just after a class is loaded in the memory
    //and it can be used to initialize static data members of a class.
    //You can have multiple static blocks in a single class.
    static {
        System.out.println("Static code block invoked");
    }

    public static void main(String[] args) {
        //Person person= new Person();
        //person.validateAge(15);
        //Person person1= new Person(1);
    }
}
