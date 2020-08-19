package ru.geekbrains.homeworks;

public class Team {
    protected String team_name = "Гладиаторы";

        Animal team [] = {
                new Cat ("Барсик", "серый", "Кот", 5),
                new Fish ("Фрэнсис", "золотой", "Рыба", 1),
                new Gull ("Лея","белый", "Чайка", 4),
                new Hedgehog ("Ёж", "черный","Ёжик", 3)
        };
        void infoTeam(){
            System.out.printf ("В команду %s входят: ", team_name);
            System.out.println();
            for (int i = 0; i<team.length; i++){
                System.out.printf("%s %s цвет: %s, возраст: %d, ", team[i].type, team[i].name, team[i].color, team[i].age);
                System.out.println();
            }
        }
    void startLevel1 () {
        for (int i = 0; i < team.length; i++) {
            if (team[i] instanceof Swimmable) {
                System.out.printf("%s %s прошел первый уровень", team[i].type, team[i].name);
                System.out.println();
            }
        }
    }

    void startLevel2 () {
        for (int i = 0; i < team.length-1; i++) {
            if (team[i] instanceof Runable) {
                System.out.printf("%s %s прошел второй уровень", team[i].type, team[i].name);
                System.out.println();
            }
        }
    }

    void startLevel3 () {
        for (int i = 0; i < team.length; i++) {
            if (team[i] instanceof Flyable) {
                System.out.printf("%s %s прошел третий уровень", team[i].type, team[i].name);
                System.out.println();
                System.out.printf("Победитель: %s %s", team[i].type, team[i].name);
            }
        }
    }

}
