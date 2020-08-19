package ru.geekbrains.homeworks;
// это ёжик
public class Hedgehog extends Animal implements Runable{

    public Hedgehog(String name, String color, String type, int age) {
        super(name, color, type, age);
    }

    @Override
    public void run() {
        System.out.println("Ёжик пробежал дистанцию");
    }
}
