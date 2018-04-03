package com.company;

public class Monkey extends Animal{
    public Monkey()
    {
        System.out.println("A monkey is born ...");
    }
    @Override
    public String jump() {
        return "Monkeys jump high!";
    }
    @Override

    public String breastFeed() {
        return "Monkeys breastfeed ...";
    }
    public String think() {
        return "Monkeys jump";
    }
}
