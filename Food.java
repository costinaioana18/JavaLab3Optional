package com.company;

public class Food implements Item{

    String name;
    int weight;

    public Food(String nume, int greutate){
        this.name=nume;
        this.weight=greutate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getValue() {
        return this.weight*2;
    }




}
