package com.company;

public class SaberToothTiger extends Animal {

    public SaberToothTiger()
    {
        System.out.println("A Saber Tooth Tiger is born");
    }
    @Override
    public String eatMeat()
    {
        return "Saber Tooth Tiger eats meat";
    }
    @Override
    public String runFast()
    {
        return " Saber Tooth Tiger runs fast";
    }
    public String extinct()
    {
        return " Saber Tooth Tigers are extinct";
    }
}
