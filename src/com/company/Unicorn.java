package com.company;

public class Unicorn extends  Animal {

    public Unicorn() {
        System.out.println("Unicorn is born ...");
    }
@Override
    public String walksSoftly()
    {
        return " Unicorn walks softly ..";
    }
    @Override
    public String eatsGrass()
    { return "They eat grass ";
    }
    public String fly()
    {
        return "Unicorns can fly";
    }
}
