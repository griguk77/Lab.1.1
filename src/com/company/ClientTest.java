package com.company;

public class ClientTest {
    public static void testClient(){
        System.out.println("Тестирование класса Client:");
        Client c = new Client("Алексей");
        if (c.getName().isEmpty()){
            System.out.println("У клиента отсутствует имя");
        }
        else {
            System.out.println(c.getName());
        }
        if (c.think().isEmpty()){
            System.out.println("Метод возвращает пустоту");
        }
        else {
            System.out.println(c.think());
        }
    }
}