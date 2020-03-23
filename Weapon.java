package com.company;



public class Weapon implements Item {

    TypeOfWeapon type;
    int weight;
    int value;

    public Weapon(TypeOfWeapon tip, int greutate, int valoare){ //constructorul
        this.type=tip;
        this.weight=greutate;
        this.value=valoare;
    }

    @Override
    public String getName() {
        return ""+ type;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public int getValue() {
        return this.value;
    }


}
