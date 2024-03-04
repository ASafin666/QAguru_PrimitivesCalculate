package org.example;

public class PrimitivesCalculate {
    public static void main(String[] args) {
        // Булевы значения
        boolean answerArtem = true;
        boolean answerOleg = false;

        // Byte - последовательность из 8и битов (1111 1111)
        byte maxByte = 127;
        byte minByte = -128;

        //Short - короткое число, состоящее из 2х байт (16 битов)
        short maxShort = 32_767;
        short minShort = -32_768;

        //Int - целое число, которое состоит из 4х байт или 32 битов
        int maxInteger = 2_147_483_647;
        int minInteger = -2_147_483_648;

        //Long - целое число, которое состоит из 8 байт, или 64 битов
        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        //Double - число с плавающей точной, 64 бит
        double myBottle = 1.5;
        //Float - число с плавающей точкой, 32 бит
        float bottleOfCola = 0.33F;

        double doubleNumber = 1.12345678901234567890;
        float floatNumber = 1.12345678901234567890F;

//        System.out.println(doubleNumber);
//        System.out.println(floatNumber);

        //Char - character (символ), занимет 16 бит
        char letter = 'Б' + 1; // Рассматривает символ по таблице кодировок и прибавляя 1 выдает символ который стоит на 1 далее
//        System.out.println(letter);



        // строковый тип
        String toBePrint = "Hello World!";

        // ОПЕРАТОРЫ
        // присвоение '='
        String name = "Artem";

        // арифметические операторы  + - / * % ++ --
//        System.out.println(5 % 3);

        // операторы сравнения < > <= >= != ==
//        System.out.println(3 > 2);

        // логические поераторы &, |, &&, ||, ^(!=), !
        int age = 33;
//        System.out.println(name.equals("Artem") && age == 33);

        // оператор instanceof позволяет проверить тип данных
//        System.out.println(name instanceof String);

        // тернарный оператор
        char sex = 'm';
        String childName = sex == 'm'
                ? "Adam"
                : "Eva";

        // if
        if (sex == 'm') {
            childName = "Adam";
        } else {
            childName = "Eve";
        }

        // ключевое слово new
        String firstName = new String("Artem");

//        1. поупражняться с математическими и логическими операторами
        int in_a = 10;
        int int_b = 20;
        int c;
        c = ++in_a;
        System.out.println(c);

        boolean a = true;
        boolean b = true;

        boolean AandB = a && b;
        if (a && b) {
            System.out.println("всё истино");
        } else {
            System.out.println("не всё истино");
        }

//        2. добиться переполнения при вычислениях, посмотреть результаты (вывести в консоль)
        byte overflow = ++maxByte;
        System.out.println("переполнение байта: " + overflow);

//        3. попробовать вычисления комбинаций типов данных (int и double)
        double d = 2.2;
        int i = 2;
        System.out.println(d + i);
    }
}