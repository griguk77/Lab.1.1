package com.company;

public final class Employee extends AbstractPerson {
    final String department = "Номер 1";

    Employee(String name) {
        super(name);
    }

    public String think() {
        return "Пролетарии всех стран, объединяйтесь";
    }

    public String getName(){
        return this.name;
    }
}