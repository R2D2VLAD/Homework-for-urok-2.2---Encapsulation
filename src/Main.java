public class Main {
    private static void printInfo(Flower flower) {
        System.out.println("Цвет: " + flower.getFlowerColor() + ", " + "страна: " + flower.getCountry() + ", "
                + "стоимость штуки - " + flower.getCost() + ", " + "срок стояния: " + flower.lifeSpan);
    }
    public static void main(String[] args) {
        //Домашняя работа
        System.out.println("Домашняя работа");
        //Задание 1
        System.out.println("Задание 1");
        Human Максим = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        System.out.println(Максим);
        Human Аня = new Human("Аня", "Москва", 1993,
                "методистобразовательных программ");
        System.out.println(Аня);
        Human Катя = new Human("Катя", "Калининград", 1992, "продакт-менеджером");
        System.out.println(Катя);
        Human Артём = new Human("Артём", "Москва", 1995,
                "директор по развитию бизнеса");
        System.out.println(Артём);
        Human Владимир = new Human("Владимир", "Казань", 2001, null);
        System.out.println(Владимир);
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        Flower rosa = new Flower(null, "Голландия", 35.59);
        printInfo(rosa);
        Flower hrizantema = new Flower(null, null, 15);
        hrizantema.lifeSpan = 5;
        printInfo(hrizantema);
        Flower pion = new Flower(null, "Англия", 69.9);
        pion.lifeSpan = 1;
        printInfo(pion);
        Flower hipsofila = new Flower(null, "Турция", 19.5);
        hipsofila.lifeSpan = 10;
        printInfo(hipsofila);
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");

    }
    }

