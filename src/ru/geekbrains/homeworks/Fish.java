package ru.geekbrains.homeworks;

public class Fish extends Animal implements Swimmable{

    public Fish(String name, String color, String type, int age) {
        super(name, color, type, age);
    }

    @Override
    public void swim() {
        System.out.println("Рыба переплыла препятствие");
    }
}
