import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    // задание 1
//    private static void task1() {
//        System.out.println(" Задание 1");
//        for (int i = 1; i < 11; i++) { // С помощью цикла for выводим в консоль все числа от 1 до 10.
//            System.out.println(i);
//        }
//    }
//    private static void task2() {
//        // задание 2
//        System.out.println(" Задание 2 ");
//        for (int i = 10; i > 0; i--) { // С помощью цикла for выводим в консоль все числа от 10 до 1.
//            System.out.println(i);
//        }
//    }
//    private static void task3() {
//        System.out.println(" Задание 3 ");
//        for (int i = 0; i < 17; i++) { // Вывожу в консоль все четные числа от 0 до 17.
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//    private static void task4() {
//        System.out.println(" Задание 4");
//        for (int i = 10; i > -11; i--) { // Вывожу в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
//            System.out.println(i);
//        }
//    }
//    private static void task5() {
//        System.out.println(" Задание 5");
//        for (int i = 1904; i <= 2096; i += 4) {
//            // надонаписать программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
//            System.out.println("Високосный год " + i);
//        }
//    }
//    private static void task6() {
//        System.out.println(" Задание 6 ");
//        //Пишем  программу, которая выводит в консоль последовательность чисел:
//        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
//        for (int i = 7; i < 99; i += 7) {
//
//            System.out.println(i);
//        }
//    }
//    private static void task7() {
//        System.out.println(" Задание 7");
//// Пишем программу, которая выводит в консоль последовательность чисел:
////1 2 4 8 16 32 64 128 256 512
//        for (int i = 1; i < 513; i *= 2) {
//            System.out.println(i);
//        }
//    }
//    private static void task8() {
//        System.out.println(" Задание 8 ");
////Подсчитываем сумму годовых накоплений, если каждый месяц будем откладывать по 29 000 рублей «в банку».
//        int savings = 29000;
//        int total = 0;
//        for (int i = 0; i < 12; i++) {
//            total = total + savings;
//            System.out.println("Месяц " + i + " Итого " + total);
//        }
//    }
//    private static void task9() {
//        System.out.println(" Задание 9 ");
//        // Подсчитываем сумму годовых накоплений при размешении в банк под проценты — 12% годовых
//        int savings1 = 29000;
//        int total1 = 0;
//        for (int i = 0; i < 12; i++) {
//            total1 = total1 + total1 /100;
//            total1 = total1 + savings1;
//            System.out.println("Месяц " + i + " Итого " + total1);
//        }
//    }
//    private static void task10() {
//        System.out.println(" Задание 10 ");
//        // пишем программу для вывода таблицы умножения на 2:
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + " * 2 = " + i * 2);
//        }
//    }
    private static void task1() {
        System.out.println("Задача1");
        int salary = 0;
        int total = 0;
        while (total < 2459000) {
            total = total + 15000;
            total = total + salary;
            System.out.println(total);
        }
    }

    private static void task2() {
        System.out.println("Задание 2 ");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");

        }
        System.out.println("");
    }


    private static void task3() {
        System.out.println(" Задание 3 ");
        int population = 12000000;
        int death = 8;
        int born = 17;
        int raz = born - death;
        for (int i = 1; i <= 10; i++) {
            population = population + population * raz / 1000;
            System.out.println("Год " + i + " численность населения составляет " + population);
        }

    }

    private static void task4() {
        System.out.println(" Задание 4");
        int salary = 15000;
        int x = 0;
        while (salary <= 12000000) {
            salary += salary / 100 * 7;
            x++;
            System.out.println("месяц " + x + " " + salary);

        }
    }
    private static void task5() {
        System.out.println(" Задание 5");
        int salary = 15000;
        int x = 0;
        while (salary <= 12000000) {
            salary += salary / 100 * 7;
            x++;
            if (x%6==0) {
                System.out.println("месяц " + x + " " + salary);
            }
        }
    }
}








