package com.company;

public class Fish extends Animal {

    public Fish(){
        System.out.println("A fish is born ..");
        }



    @Override
    public String eat()
    { return "Fish eats fish...";
    }
    @Override
    public String sleep()
    { return "Fish eats fish...";
    }


    public String swim()
    {
        return " Dog barks ....";
    }
}


