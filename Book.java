package com.company;

public class Book implements Item{

    protected int nrOfPages;
    String name;
    int value;

    public Book(String nume, int nrPg, int valoare){
        this.nrOfPages=nrPg;
        this.name=nume;
        this.value=valoare;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getWeight() {
        return this.nrOfPages/100;
    }

    @Override
    public int getValue() {
        return this.value;
    }


    @Override
    public int compareTo(Item o) {
        return 0;
    }
}