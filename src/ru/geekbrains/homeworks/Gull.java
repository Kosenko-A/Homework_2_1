package ru.geekbrains.homeworks;
//это чайка
public class Gull extends Animal implements Swimmable, Runable, Flyable{

    public Gull(String name, String color, String type, int age) {
        super(name, color, type, age);
    }

    @Override
    public void fly() {
        System.out.println("Чайка пролетела над высоким барьером");
    }

    @Override
    public void run() {
        System.out.println("Чайка пробежала дистанцию");
    }

    @Override
    public void swim() {
        System.out.println("Чайка переплыла дистанцию");
    }
}
