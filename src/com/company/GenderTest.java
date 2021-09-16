package com.company;

public class GenderTest {
    public static void testGender() {
        System.out.println("Тестирование класса Gender:");
        Gender g1 = Gender.MALE;
        Gender g2 = Gender.FEMALE;
        Gender g3 = Gender.OTHER;
        if (g1.getStrValue().isEmpty()) {
            System.out.println("Гендер отсутствует");
        }
        if (g1.getStrValue().equals("Мужчина")) {
            System.out.println("Гендер объекта - мужской");
        }
        if (g2.getValue() == 2) {
            System.out.println("Объект является женщиной");
        }
        if (g3.getValue() >= 1024) {
            System.out.println("Возможный гендер объекта - ударный вертолёт Апач");
        }
    }
}
