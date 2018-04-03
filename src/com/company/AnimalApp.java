package com.company;

import static jdk.nashorn.internal.objects.Global.print;

public class AnimalApp {
    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.bark());

        Fish f = new Fish();
        print(f.swim());
        print(f.eat());
        print(f.sleep());

        Monkey m = new Monkey();
        print(m.jump());
        print(m.breastFeed());
        print(m.think());

        Unicorn u = new Unicorn();
        print(u.walksSoftly());
        print(u.eatsGrass());
        print(u.fly());

        SaberToothTiger s = new SaberToothTiger();
        print(s.eatMeat());
        print(s.runFast());
        print(s.extinct());
    }

    private static void print(String s) {
        System.out.println(s);

    }
}
