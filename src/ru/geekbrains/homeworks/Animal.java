package ru.geekbrains.homeworks;

public abstract class Animal {
    protected String name;
    protected String color;
    protected String type;
    protected int age;


    public Animal(String name, String color, String type, int age){
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;
    }

}
