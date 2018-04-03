package com.company;

public class Dog extends Animal {
    public Dog() {
        //Super
        System.out.println("A dog is born....");
    }

    @Override
    public String eat() {
        return " Dog eats meat...";
    }


        @Override
        public String sleep() {
            return "Dogs sleep whenever they get a chance";
        }


public String bark()
{
    return " Dog barks ....";
    }
}
