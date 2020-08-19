package ru.geekbrains.homeworks;

public class Cat extends Animal implements Runable, Swimmable{

    public Cat(String name, String color, String type, int age) {
        super(name, color, type, age);
    }

    @Override
    public void swim() {
        System.out.println("Кот переплыл препятствие");
    }

    @Override
    public void run() {
        System.out.println("Кот пробежал дистанцию");
    }
}
