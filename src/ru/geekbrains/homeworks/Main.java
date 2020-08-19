package ru.geekbrains.homeworks;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
	Team team = new Team();
	team.infoTeam();

	System.out.println();

	Course course = new Course();
	course.infoCourse();

	course.startChampionat();
	team.startLevel1();
	System.out.println();
	team.startLevel2();
	System.out.println();
	team.startLevel3();


    }
}
