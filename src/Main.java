import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");


        int age = 20;
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age +
                    " то он совершеннолетний ");
        } else {
            System.out.println(" Если возраст человека равен " + age +
                    " то он не достиг совершеннолетия, нужно немного подождать ");
        }

        System.out.println("Задание 2");

        int temperature = 7;
        if (temperature >= 5) {
            System.out.println(" На улице " + temperature + " градусов можно идти без шапки ");
        } else {
            System.out.println(" На улице " + temperature + " градусов нужно надеть шапку ");
        }

        System.out.println("Задание 3");

        int speed = 60;
        if (speed >= 60) {
            System.out.println(" Если скорость  " + speed + " придется заплтатить штраф ");
        } else {
            System.out.println(" Если скорость " + speed + " можно ездить спокойно ");
        }

        System.out.println("Задание 4");

        int ages = 7;
        if (ages >= 2 && age <= 6) {
            System.out.println(" Если возраст человека равен " + ages + " то ему надо ходить в детский сад ");
        } else if (ages >= 7 && ages <= 17) {
            System.out.println(" Если возраст человека равен " + ages + " то ему надо ходить в школу ");
        } else if (ages >= 18 && ages <= 24) {
            System.out.println(" Если возраст человека равен " + ages + " то его место в университет");
        } else {
            System.out.println(" Если возраст человека равен " + ages + " то ему надо ходить на работу");
        }

        System.out.println("Задание 5");

        int child = 15;
        if (child < 5) {
            System.out.println("Если возраст ребенка равен " + child +
                    ", то ему нельзя кататься на аттракционе.");
        } else if (child >= 5 && child < 14) {
            System.out.println("Если возраст ребенка равен " + child +
                    ", то ему можно кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + child +
                    ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("Задание 6");

        int passengersCount = 20;
        if (passengersCount <= 60) {
            System.out.println("Есть свободные сидячие места");
        } else if (passengersCount > 60 && passengersCount <= 102) {
            System.out.println("Свободных сидячих мест нет, есть стоячие места");
        } else {
            System.out.println("Вагон заполнен полностью, мест нет");
        }

        System.out.println("Задание 7");

        int one = 5;
        int two = 55;
        int three = 3;

        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }






    }
}