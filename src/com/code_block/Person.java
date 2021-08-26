package com.code_block;

public class Person {

    //An anonymous block in java is a special member of a class.
    //It does not have names and represents statements that are common to
    // all the constructors of the class.
    //An anonymous block is used when you want to execute some common statements before all
    // the constructors that are available in a class.
    //As you can see the statement of the anonymous block is executed before the constructor.
    //This happened because, at the time of compilation,
    //statements of the anonymous block are moved to the beginning of each constructor
    //by the compiler.

    {
        System.out.println("Anonymous code block");
    }

    static {
        System.out.println("Static block");
    }

    public Person(){
        System.out.println("Empty ctor invoked");
    }

    public Person(int id){
        this();

        System.out.println("Parameterized ctor invoked");
    }

    public void validateAge(int age) {
        namedcodeblock:
        {
            if (age < 18)
                break namedcodeblock;

            System.out.println("Over 18- All good");
        }

        System.out.println("Under 18- Unauthorised");
    }
}
