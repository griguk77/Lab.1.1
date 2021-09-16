package com.company;

public abstract class AbstractPerson implements HumanInterface{
    protected String name;
    public String getName(){
        return this.name;
    }
    AbstractPerson(String name){
        this.name = name;
    }
    public abstract String think();
}