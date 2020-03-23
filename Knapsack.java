package com.company;
import java.util.ArrayList;

public class Knapsack {
    int capacity; //capacitatea totala a rucsacului
    int usedCapacity;//capacitatea ocupata de obiecte a rucasacului
    int totalVal;// valoara totala curenta a obiectelor din rucsac
    String name;
    ArrayList<Item> items=new ArrayList<Item>();

    public int getUsed(){
        return this.usedCapacity;
    }

    public Knapsack(String nume,int capacitate){ //constructorul
        this.capacity=capacitate;
        this.usedCapacity=0;
        this.totalVal=0;
        this.name=nume;
    }

    public void addItem(Item item){ //incercam sa adaugam un item
        if(item.getWeight()+usedCapacity<=capacity){ //daca ne permite capacitatea, il adaugam si i adaugam greutatea la greutatea utilizata
            System.out.println("We added " + item.getName() + " . ");
            this.totalVal=item.getValue()+this.totalVal;
            this.usedCapacity=this.usedCapacity+item.getWeight();
            items.add(item);
        }
        else{ //daca nu ne permite capacitatea sa l adaugam, afisam un mesaj
            System.out.println("We cannot add " + item.getName() + " . ");
        }
    }

    public int totalValue(){
        return totalVal;
    } //returnam valoara curenta totala a obiectelor din rucsac

    public String getName(){
        return this.name;
    }
}
