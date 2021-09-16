package com.company;

public class EmployeeTest {
    public static void testEmployee(){
        System.out.println("Тестирование класса Employee:");
        Employee e = new Employee("Геннадий");
        if (e.getName().isEmpty()){
            System.out.println("У работника отсутствует имя");
        }
        else {
            System.out.println(e.getName());
        }
        if (e.think().isEmpty()){
            System.out.println("Метод возвращает пустоту");
        }
        else {
            System.out.println(e.think());
        }
    }
}
