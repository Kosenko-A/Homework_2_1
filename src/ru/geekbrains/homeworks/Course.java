package ru.geekbrains.homeworks;

public class Course {
    Barrier[] barriers = {new Barrier("переплыть реку"), new Barrier("пробежать по дорожке"), new Barrier("пролететь над барьером")};

    void infoCourse() {
        System.out.println("Для прохождения полосы препятствий нужно:");
        for (int i = 0; i < barriers.length; i++) {
            System.out.println(barriers[i].type);
        }
    }
    void startChampionat(){
        System.out.println();
        System.out.println("Cоревнования начинаются!");
        System.out.println();
    }
}
