public class Main {
    public static void main(String[] args) {

    // Задание №1.1
        System.out.println("");
        System.out.println("Задание №1.1:");

        int ageBirthdayPerson = 17;

        if (ageBirthdayPerson >= 18) {
            System.out.println("Поздравяляем с совершеннолетием!");
        }

        if (ageBirthdayPerson < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил!");
        }

    // Задание №1.2
        System.out.println("");
        System.out.println("Задание №1.2:");

        byte ageMan = 21;

        if (ageMan < 7) {
            System.out.println("Ребенок ходит в сад или сидит дома!");
        }

        if (ageMan >= 7 && ageMan < 18) {
            System.out.println("Ребенок ходит в школу");
        }

        if (ageMan >= 18 && ageMan < 24) {
            System.out.println("Человек закончил школу и учиться в универсете");
        }

        if (ageMan > 24){
            System.out.println("Человек закончил университет и ходит на работу или сидит дома!");
        }

    // Задание №1.3
        System.out.println("");
        System.out.println("Задание №1.3:");

        byte totalSeatsWagon = 102;
        byte seatsPlace = 60;

        byte amountPassangers = 50;

        if (amountPassangers <= seatsPlace) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (amountPassangers > seatsPlace && amountPassangers <= totalSeatsWagon) {
            System.out.println("В вагоне есть стоячие места");
        }
        if (amountPassangers > totalSeatsWagon){
            System.out.println("В вагоне нет свободных мест");
        }

    // Задание №2.1
        System.out.println("");
        System.out.println("Задание №2.1:");

        int ageBirthdayPerson_Else = 19;

        if (ageBirthdayPerson_Else >= 18) {
            System.out.println("Поздравяляем с совершеннолетием!");
        }
        else  {
            System.out.println("Возраст совершеннолетия еще не наступил!");
        }

    // Задание №2.2
        System.out.println("");
        System.out.println("Задание №2.2:");

        byte ageMan_Else = 25;

        if (ageMan_Else < 7) {
            System.out.println("Ребенок ходит в сад или сидит дома!");
        }
        else {
            if (ageMan_Else >= 7 && ageMan_Else < 18) {
                System.out.println("Ребенок ходит в школу");
            }
            else {
                if (ageMan_Else >= 18 && ageMan_Else < 24) {
                    System.out.println("Человек закончил школу и учиться в универсете");
                }
                else {
                    System.out.println("Человек закончил университет и ходит на работу или сидит дома!");
                }
            }
        }

    // Задание №2.3
        System.out.println("");
        System.out.println("Задание №2.3:");

        byte totalSeatsWagon_Else = 102;
        byte seatsPlace_Else = 60;

        byte amountPassangers_Else = 110;

        if (amountPassangers_Else <= seatsPlace_Else) {
            System.out.println("В вагоне есть сидячие места");
        }
        else {
            if (amountPassangers_Else > seatsPlace_Else && amountPassangers_Else <= totalSeatsWagon_Else) {
                System.out.println("В вагоне есть стоячие места");
            }
            else {
                System.out.println("В вагоне нет свободных мест");
            }
        }

    // Задание №3.1
        System.out.println("");
        System.out.println("Задание №3.1:");

        byte ageMan_3 = 1;

        boolean goToKindergarten = ageMan_3 >= 2 && ageMan_3 < 7;
        boolean goToSchool = ageMan_3 >= 7 && ageMan_3 <= 18;
        boolean goToСollege = ageMan_3 > 18 && ageMan_3 < 24;
        boolean goToWork = ageMan_3 >= 24;

        if (ageMan_3 < 2) {
            System.out.println("Если возраст человка меньше 2-х, то он еще только учиться ходить!");
        }

        if (goToKindergarten) {
            System.out.println("Если возраст человка от 2 до 6 лет, то ему нужно ходить в сад");
        }
        else {
            if (goToSchool) {
                System.out.println("Если возраст человка от 7 до 18 лет, то ему нужно ходить в школу");
            }
            else {
                if (goToСollege) {
                    System.out.println("Если возраст человка от 18 до 24 лет, то его место в университете");
                }
                else {
                    if (goToWork) {
                        System.out.println("Если возраст человека больше 24, то ему пора ходить на работу");
                    }
                }
            }
        }

    // Задание №3.2
        System.out.println("");
        System.out.println("Задание №3.2:");

        byte ageChild = 16;

        if (ageChild < 5) {
            System.out.println("Ребенку меньше 5 лет, он не может кататься на аттракционе!");
        }
        else {
            if (ageChild >= 5 && ageChild < 14) {
                System.out.println("Ребенку меньше 14 лет, он может кататься на аттракционе, только в сопровождении взрослого!");
            }
            else {
                System.out.println("Ребенку более 14 лет, он может кататься на аттракционе без сопровождения взрослого!");
            }
        }

// Задание №3.3
        System.out.println("");
        System.out.println("Задание №3.3:");

        int one = 20;
        int two = 200;
        int free = 3;

        int max = one;

        if (max < two) {
            max = two;
            if (max < free) {
                max = free;
            }
        }

        System.out.println("Максимальное число - " + max);
    }
}